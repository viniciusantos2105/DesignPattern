package br.com.designpattern.builder.director;

import br.com.designpattern.builder.builders.IBuilder;
import br.com.designpattern.builder.components.CarType;
import br.com.designpattern.builder.components.Engine;
import br.com.designpattern.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}
