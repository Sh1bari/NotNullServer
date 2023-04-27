package socket;

import com.example.notnullserver.NotNullServerApplication;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import lombok.*;
import org.springframework.stereotype.Service;

import socket.services.serviceImpl.SocketImlp;
import socket.services.threads.ThreadServiceBI;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

@Service
public class MainServerSocket extends SocketImlp {
    private static final Logger log =
            Logger.getLogger(MainServerSocket.class.getName());

    public static String toJson(MessageOrBuilder messageOrBuilder) throws IOException {
        return JsonFormat.printer().print(messageOrBuilder);
    }

    private Socket socket;

    public static boolean timeout = true;

    public static final Object objForClose = new Object();

    protected static final Object objForHandshake = new Object();

    public static String handshakeConnectionMessage;

    public void main() throws Exception {
        openMainSocket();
        while(true){
            socket = serverSocket.accept();
            try {
                new ThreadServiceBI(socket);
            }catch (Exception e){
                log.info("Не удалось подключиться к сервису");
                socket.close();
            }

        }
        /*ValueRef val = ValueRef.newBuilder()
                .build();
        OutputStream str = clientSocket.getOutputStream();
        str.write(val.toByteArray());*/
    }

}
