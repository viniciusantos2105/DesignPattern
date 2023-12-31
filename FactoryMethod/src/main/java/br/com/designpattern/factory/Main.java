package br.com.designpattern.factory;

import java.util.Scanner;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        configure(type);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log" :
                transport = new MotorcycleTransport();
                break;
            case "eats" :
                transport = new BikeTransport();
                break;
            default :
                System.out.println("Selecione o tipo de entrega");
        }
    }
}