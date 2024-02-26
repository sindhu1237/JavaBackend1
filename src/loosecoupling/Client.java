package loosecoupling;

public class Client {
    public static void main(String[] args) {
        Car obj = new Car();
//        System.out.println(obj.ms);
        obj.playSong();

        Sony sonyMusicSystem = new Sony();
        obj.setMusicSystem(sonyMusicSystem);

        obj.playSong();

        Bose boseMusicSystem = new Bose();
        obj.setMusicSystem(boseMusicSystem);

        obj.playSong();
    }
}
