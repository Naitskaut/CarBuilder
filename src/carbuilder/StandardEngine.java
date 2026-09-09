package carbuilder;

public class StandardEngine implements Engine {
    private final double volume;
    private final int mileageKm;

    public StandardEngine(double volume, int mileageKm){
        this.volume = volume;
        this.mileageKm = mileageKm;

    }

    @Override
    public double getVolume(){
        return volume;

    }
    @Override
    public int getMileageKm(){
        return mileageKm;

    }
    @Override
    public String describe(){
        return "Standard engine, %.1fL, %d km".formatted(volume,mileageKm);
    }
    @Override
    public String getName(){ return "Standart engine, %.1fL".formatted(volume);}
}
