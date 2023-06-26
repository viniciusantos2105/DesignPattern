package br.com.designpattern.abstractfactory.app;

import br.com.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.designpattern.abstractfactory.factories.ITransportFactory;
import br.com.designpattern.abstractfactory.landvehicles.ILandVehicle;

public class Application {

    private final ILandVehicle vehicle;
    private final IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
