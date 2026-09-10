package carbuilder;

public final class Car {
    private final CarType type;
    private final Engine engine;
    private final Transmission transmission;
    private final int seats;

    Car(CarType type, Engine engine, Transmission transmission, int seats){
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.seats = seats;
    }

    public CarType getType(){
        return type;
    }
    public Engine getEngine(){
        return engine;
    }
    public Transmission getTransmission(){
        return transmission;
    }
    public int getSeats(){
        return seats;
    }

    @Override
    public String toString(){
        return "Car -> type=%s, engine=%s, transmission=%s, seats=%s".formatted(type,engine.describe(),transmission,seats);
    }

}

