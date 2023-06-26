package br.com.designpattern.adapter;

import br.com.designpattern.adapter.adapters.PayoneerAdapter;
import br.com.designpattern.adapter.payoneer.Payonner;
import br.com.designpattern.adapter.paypal.IPayPalPayments;
import br.com.designpattern.adapter.paypal.PayPal;

public class Main {
    public static void main(String[] args) {

        IPayPalPayments payments = new PayoneerAdapter(new Payonner());
        payments.paypalPayment();
        payments.paypalReceive();
    }
}