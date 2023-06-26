package br.com.designpattern.adapter.utils;

public class Token {
    private String token;

    public Token(){
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiRGVzaWduIiwiaWF0IjoxMDIwfQ.LEcC0gkAnHBKGydLbRpP8A-MWOjKKwtLmCWmq-xRamI";
    }

    public String getToken(){
        return token;
    }
}
