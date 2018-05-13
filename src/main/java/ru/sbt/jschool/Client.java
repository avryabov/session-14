package ru.sbt.jschool;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCompute;
import org.apache.ignite.Ignition;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Ignition.setClientMode(true);
        Ignite ignite = Ignition.start();
        IgniteCompute compute = ignite.compute();
        compute.broadcast(() -> System.out.println("Hello from Client!"));
        Thread.sleep(60000);
    }
}
