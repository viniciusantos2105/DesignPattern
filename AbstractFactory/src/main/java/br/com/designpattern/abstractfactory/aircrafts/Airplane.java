package br.com.designpattern.abstractfactory.aircrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, voo autorizado");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, ventos ok!");
    }
}
