package br.com.designpattern.factory;

import br.com.designpattern.factory.vehicles.Bike;
import br.com.designpattern.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
