package ru.sbt.jschool;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;

public class Server {
    public static void main(String[] args) throws InterruptedException {
        Ignite ignite = Ignition.start();
        Thread.sleep(60000);
    }
}
