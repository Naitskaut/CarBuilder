package carbuilder;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        CarDirector director = new CarDirector();

        CarPartsBuilder sportBuilder = new CarPartsBuilder();
        director.makeSportCar(sportBuilder);
        Car sportCar = sportBuilder.getResult();
        System.out.println(sportCar);

        CarPartsBuilder familyBuilder = new CarPartsBuilder();
        director.makeFamilyCar(familyBuilder);
        Car familyCar = familyBuilder.getResult();
        System.out.println(familyCar);

        CarPartsBuilder cityBuilder = new CarPartsBuilder();
        director.makeCityCar(cityBuilder);
        Car cityCar = cityBuilder.getResult();
        System.out.println(cityCar);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSportCar(manualBuilder);
        CarManual sportManual = manualBuilder.getResult();
        System.out.println(sportManual.getContent());

        Car customCar = new CarPartsBuilder()
                .setType(CarType.SUV)
                .setEngine(new SportEngine(4.0, 100))
                .setSeats(2)
                .setTransmission(Transmission.AUTOMATIC)
                .getResult();
        System.out.println(customCar);

        CarManual customManual = new CarManualBuilder()
                .setType(CarType.SPORT)
                .setEngine(new SportEngine(16.0, 0))
                .setTransmission(Transmission.MANUAL)
                .setSeats(2)
                .getResult();
        System.out.println(customManual.getContent());

        try {
            new CarPartsBuilder()
                    .setType(CarType.CITY)
                    .setEngine(new StandardEngine(1.0, 0))
                    .setSeats(11)
                    .setTransmission(Transmission.MANUAL)
                    .getResult();
        } catch (IllegalStateException e) {
            System.out.println("Validation works: " + e.getMessage());
        }
    }
}
