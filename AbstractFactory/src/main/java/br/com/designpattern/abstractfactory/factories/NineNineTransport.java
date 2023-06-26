package br.com.designpattern.abstractfactory.factories;

import br.com.designpattern.abstractfactory.aircrafts.Helicopter;
import br.com.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.designpattern.abstractfactory.landvehicles.ILandVehicle;
import br.com.designpattern.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
