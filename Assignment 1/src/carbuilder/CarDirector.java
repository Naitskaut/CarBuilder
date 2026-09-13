package carbuilder;

public class CarDirector {
    public void makeSportCar(CarBuilder builder){
        builder.reset()
                .setType(CarType.SPORT)
                .setEngine(new SportEngine(8.0, 5000))
                .setTransmission(Transmission.MANUAL)
                .setSeats(2);
    }
    public void makeFamilyCar(CarBuilder builder){
        builder.reset()
                .setType(CarType.SUV)
                .setEngine(new StandardEngine(3.0, 30000))
                .setTransmission(Transmission.AUTOMATIC)
                .setSeats(5);
    }
    public void makeCityCar(CarBuilder builder) {
        builder.reset()
                .setType(CarType.CITY)
                .setEngine(new StandardEngine(1.2, 12000))
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setSeats(4);
    }

}
