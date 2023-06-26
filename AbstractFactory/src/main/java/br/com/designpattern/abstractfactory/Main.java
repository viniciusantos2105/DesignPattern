package br.com.designpattern.abstractfactory;

import br.com.designpattern.abstractfactory.app.Application;
import br.com.designpattern.abstractfactory.factories.ITransportFactory;
import br.com.designpattern.abstractfactory.factories.NineNineTransport;
import br.com.designpattern.abstractfactory.factories.UberTransport;

import java.util.Scanner;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        Scanner sc = new Scanner(System.in);
        String company = sc.nextLine();

        if(company.equalsIgnoreCase("uber")){
            factory = new UberTransport();
        }else{
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }
    public static void main(String[] args) {

       Application app = configureApplication();
       app.startRoute();
    }
}