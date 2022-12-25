package com.turn.ttorrent.cli;

import com.turn.ttorrent.client.SimpleClient;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PatternLayout;

import java.io.IOException;
import java.net.*;

public class SimpleClientTest {

    public static void main(String[] args) {

        BasicConfigurator.configure(new ConsoleAppender(
                new PatternLayout("%d [%-25t] %-5p: %m%n")));

        SimpleClient client = new SimpleClient();

        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        try {
            client.downloadTorrent("src/main/resources/ubuntu-22.04.1-desktop-amd64.iso.torrent", "C:/Users/91824/Downloads/", address);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        client.stop();

    }


}
