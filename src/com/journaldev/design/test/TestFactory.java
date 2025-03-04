package com.journaldev.design.test;
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;
public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "1 GB", "250 GB", "3.3 GHz");
        Computer server = ComputerFactory.getComputer("server", "8 GB", "1 TB", "3.0 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}