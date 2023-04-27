package socket.services.threads;

import socket.MainServerSocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ThreadReader extends MainServerSocket {

    private Socket socket;
    private InputStream in;

    public ThreadReader() throws IOException {
        start();
    }



}
