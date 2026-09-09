package carbuilder;

public interface CarBuilder {
    CarBuilder reset();
    CarBuilder setType(CarType type);
    CarBuilder setEngine(Engine engine);
    CarBuilder setTransmission(Transmission transmission);
    CarBuilder setSeats(int seats);
}
