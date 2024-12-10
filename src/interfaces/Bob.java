package interfaces;

interface Walk{
    public default int getSpeed(){
        return 10;
    }
}
interface Read {
    public default int getSpeed(){
        return 2;
    }
}

public class Bob implements Walk, Read {
    @Override
    public int getSpeed() {
        return Walk.super.getSpeed();
    }
}
