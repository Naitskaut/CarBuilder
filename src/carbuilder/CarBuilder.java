package carbuilder;
//Just interface such as a blueprint with method
public interface CarBuilder {
    CarBuilder reset();
    CarBuilder setType(CarType type);
    CarBuilder setEngine(Engine engine);
    CarBuilder setTransmission(Transmission transmission);
    CarBuilder setSeats(int seats);
}
