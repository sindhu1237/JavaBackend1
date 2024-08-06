package exceptionHandling.CustomException;

public class Client {
    public static void main(String[] args) {
        try {
            Car car = new Car();
            car.setMs(new BoseMs());
            car.playMusic();
        } catch (MusicSystemNotPluggedException e){
//            throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
