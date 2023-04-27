package socket.services.service;

import socket.config.Config;

public interface SocketRepo extends Config {
    void openMainSocket() throws Exception;
    void closeMainSocket() throws Exception;
}
