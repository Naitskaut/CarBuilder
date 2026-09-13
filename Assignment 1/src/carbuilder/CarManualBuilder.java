package carbuilder;

public class CarManualBuilder implements CarBuilder {
    private final StringBuilder manual = new StringBuilder();

    public CarManualBuilder(){
        reset();
    }
    @Override
    public CarManualBuilder reset(){
        manual.setLength(0);
        manual.append("\n---User Manual---\n");
        return this;

    }
    @Override
    public CarManualBuilder setType(CarType type){
        manual.append("- Car Type: ").append(type).append("\n");
        return this;
    }
    @Override
    public CarManualBuilder setEngine(Engine engine){
        manual.append("- Car engine: ").append(engine.getName()).append("\n");
        return this;
    }
    @Override
    public CarManualBuilder setTransmission(Transmission transmission){
        manual.append("- Car transmission: ").append(transmission).append("\n");
        return this;

    }
    @Override
    public CarManualBuilder setSeats(int seats){
        manual.append("- Seats: ").append(seats).append("\n");
        return this;
    }
    public CarManual getResult(){
        return new CarManual(manual.toString());
    }

}
