package br.com.designpattern.builder;

import br.com.designpattern.builder.builders.CarBuilder;
import br.com.designpattern.builder.builders.TruckBuilder;
import br.com.designpattern.builder.cars.Car;
import br.com.designpattern.builder.cars.Truck;
import br.com.designpattern.builder.director.Director;

public class Main {
    public static void main(String[] args) {


        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " +truck.result());

    }
}