package br.com.designpattern.factory;

import br.com.designpattern.factory.vehicles.IVehicle;
import br.com.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
