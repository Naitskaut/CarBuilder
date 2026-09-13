package carbuilder;

public class SportEngine implements Engine {

    private final double volume;
    private final int mileageKm;//encapsulation

    public SportEngine(double volume, int mileageKm){
        this.volume = volume;
        this.mileageKm = mileageKm;
    }
    //getters
    @Override
    public double getVolume(){
        return volume;
    }

    @Override
    public int getMileageKm(){
        return mileageKm;
    }
    //fully describe engine

    @Override
    public String describe() {
        return "Sport engine, %.1fL, %d km".formatted(volume,mileageKm);
    }
    //partly describe engine

    @Override
    public String getName(){
        return "Sport engine, %.1fL".formatted(volume);
    }

}