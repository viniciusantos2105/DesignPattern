package br.com.designpattern.adapter.paypal;

import br.com.designpattern.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
