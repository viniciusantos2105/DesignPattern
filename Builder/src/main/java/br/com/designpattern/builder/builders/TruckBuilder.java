package br.com.designpattern.builder.builders;

import br.com.designpattern.builder.cars.Truck;
import br.com.designpattern.builder.components.CarType;
import br.com.designpattern.builder.components.Engine;
import br.com.designpattern.builder.components.Transmission;

public class TruckBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;



    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getresult(){
        return new Truck(carType, seats, engine, transmission);
    }
}
