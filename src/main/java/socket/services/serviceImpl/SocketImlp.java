package socket.services.serviceImpl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import socket.services.service.SocketRepo;

import java.net.ServerSocket;
import java.net.Socket;


@Service
@NoArgsConstructor
@Getter
@Setter
public class SocketImlp
        extends Thread
        implements SocketRepo{

    protected static ServerSocket serverSocket;

    @Override
    public void openMainSocket() throws Exception {
        serverSocket = new ServerSocket(PORT);
    }

    @Override
    public void closeMainSocket() throws Exception {
        serverSocket.close();
    }


}
