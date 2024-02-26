package loosecoupling;

public class Bose implements MusicSystem {
    @Override
    public void play() {
        System.out.println("Bose is playing the song");
    }

    @Override
    public void pause() {

        System.out.println("Bose is pausing the song");
    }

    @Override
    public void forward(int x) {

        System.out.println("Bose is forwarding the song by seconds = " + x);
    }

    @Override
    public void rewind(int x) {

        System.out.println("Bose is rewinding the song by seconds = " + x);
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Bose is setting volume to level = " + level);
    }
}
