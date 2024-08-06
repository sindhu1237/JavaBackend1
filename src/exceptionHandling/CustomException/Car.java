package exceptionHandling.CustomException;

public class Car {
    private musicSystem ms;
    public void setMs(musicSystem ms){
        this.ms = ms;
    }
    void playMusic() throws MusicSystemNotPluggedException{
        if(ms == null){
            throw new MusicSystemNotPluggedException();
        }
        ms.play();
    }
}
