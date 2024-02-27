package OOps1;

public class Iphone {
    int number;
    String variant;
    int noOfCamera;
    int screenSize;
    int ram;
    int batterySize;
    int storage;
    int price;
    int processorVersion;

    public Iphone(int number, String variant, int noOfCamera, int screenSize, int ram, int batterySize, int storage, int price, int processorVersion) {
        this.number = number;
        this.variant = variant;
        this.noOfCamera = noOfCamera;
        this.screenSize = screenSize;
        this.ram = ram;
        this.batterySize = batterySize;
        this.storage = storage;
        this.price = price;
        this.processorVersion = processorVersion;
    }

    //copy constructor is nothing but a fancy parameterised constructor, instead of passing primitive arguments, we are passing reference variables
    public Iphone(Iphone iphone){
        this(iphone.number + 1, iphone.variant, iphone.noOfCamera, iphone.screenSize, iphone.ram, iphone.batterySize, iphone.storage,
                iphone.price + 10000, iphone.processorVersion) ;
    }
}
