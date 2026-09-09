package carbuilder;

public final class CarManual {
    private final String content;

    CarManual(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    @Override
    public String toString(){
        return content;
    }
}
