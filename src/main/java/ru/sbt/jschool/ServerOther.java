package ru.sbt.jschool;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCluster;
import org.apache.ignite.IgniteCompute;
import org.apache.ignite.Ignition;

public class ServerOther {
    public static void main(String[] args) throws InterruptedException {
        Ignite ignite = Ignition.start();
        IgniteCluster cluster = ignite.cluster();
        IgniteCompute compute = ignite.compute(cluster.forRemotes());
        compute.broadcast(() -> System.out.println("Hello from Other Server!"));
        Thread.sleep(60000);
    }
}
