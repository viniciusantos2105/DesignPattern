package br.com.designpattern.abstractfactory.factories;

import br.com.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.designpattern.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
