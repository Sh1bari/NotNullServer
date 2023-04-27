package com.example.notnullserver.webSocket.controllers;

import com.example.notnullserver.webSocket.services.service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import socket.MainServerSocket;

@CrossOrigin
@Controller
public class SocketController extends MainServerSocket{

    @Autowired
    private MessageSenderService messageSenderService;

    @SendTo("/newHandshake")
    private String send(){
        String varHandshakeConnectionMessage;
        while(true) {
            if (handshakeConnectionMessage != null) {
                varHandshakeConnectionMessage = handshakeConnectionMessage;
                handshakeConnectionMessage = null;
                return varHandshakeConnectionMessage;
            }
        }
    }
}
