package loosecoupling;

public interface MusicSystem {
    void play();
    void pause();
    void forward(int x);
    void rewind(int x);
    void setVolume(int level);
}
