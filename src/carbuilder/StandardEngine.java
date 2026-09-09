package carbuilder;

public class StandardEngine implements Engine {
    private final double volume; //use final to ensure that data doesn't change
    private final int mileageKm;

    public StandardEngine(double volume, int mileageKm){
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
    public String describe(){
        return "Standard engine, %.1fL, %d km".formatted(volume,mileageKm);
    }
    //partly describe engine
    @Override
    public String getName(){ return "Standart engine, %.1fL".formatted(volume);}
}
