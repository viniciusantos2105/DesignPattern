package br.com.designpattern.adapter.adapters;

import br.com.designpattern.adapter.payoneer.Payonner;
import br.com.designpattern.adapter.paypal.IPayPalPayments;
import br.com.designpattern.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {

    private Token token;
    private Payonner payonner;

    public PayoneerAdapter(Payonner payonner){
        this.payonner = payonner;
        System.out.println("Adaptando o Payoneer utilizando os métodos do paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
