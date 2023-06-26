package br.com.designpattern.builder.builders;

import br.com.designpattern.builder.components.CarType;
import br.com.designpattern.builder.components.Engine;
import br.com.designpattern.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
