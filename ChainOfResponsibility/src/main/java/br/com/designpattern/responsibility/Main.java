package br.com.designpattern.responsibility;

import br.com.designpattern.responsibility.middlewares.CheckPermissionMiddleware;
import br.com.designpattern.responsibility.middlewares.CheckUserMiddleware;
import br.com.designpattern.responsibility.middlewares.Middleware;
import br.com.designpattern.responsibility.server.Server;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("vinicius@email.com.br", "45678");
        server.registerUser("testando@email.com", "777369");

        Middleware middleware =  new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) {
        init();

        boolean done;

        do{
            System.out.println("Digite o e-mail: ");
            String email = sc.nextLine();
            System.out.println("Digite sua senha: ");
            String password = sc.nextLine();
            done = server.logIn(email, password);
        }while (!done);
    }
}