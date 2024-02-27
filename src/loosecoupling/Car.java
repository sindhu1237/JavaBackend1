package loosecoupling;

public class Car {
    private MusicSystem ms; // socket

    // putting the plug of a device inside the socket
    public void setMusicSystem(MusicSystem ms){
        this.ms = ms;
//        System.out.println(ms);
    }

    void startEngine(){

    }

    void stopEngine(){

    }

    void playSong(){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.play();
    }

    void pauseSong(){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.pause();
    }

    void forwardSong(int x){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.forward(x);
    }

    void rewindSong(int x){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.rewind(x);
    }

    void setVolumeSong(int level){
        if(ms == null){
            System.out.println("No music system installed");
            return;
        }
        ms.setVolume(level);
    }

}
