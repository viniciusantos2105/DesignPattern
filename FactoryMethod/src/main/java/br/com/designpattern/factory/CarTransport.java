package br.com.designpattern.factory;

import br.com.designpattern.factory.vehicles.Car;
import br.com.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
