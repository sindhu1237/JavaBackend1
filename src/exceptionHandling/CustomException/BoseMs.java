package exceptionHandling.CustomException;

public class BoseMs implements musicSystem{
    @Override
    public void play() {
        System.out.println("Bose logic of playing");
    }

    @Override
    public void pause() {
        System.out.println("Bose logic of pausing");
    }
}
