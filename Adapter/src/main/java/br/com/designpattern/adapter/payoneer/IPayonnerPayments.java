package br.com.designpattern.adapter.payoneer;

import br.com.designpattern.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
