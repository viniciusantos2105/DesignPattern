package br.com.designpattern.abstractfactory.factories;

import br.com.designpattern.abstractfactory.aircrafts.Airplane;
import br.com.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.designpattern.abstractfactory.landvehicles.Car;
import br.com.designpattern.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
