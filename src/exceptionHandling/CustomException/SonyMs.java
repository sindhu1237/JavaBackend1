package exceptionHandling.CustomException;

public class SonyMs implements musicSystem{
    @Override
    public void play() {
        System.out.println("Sony logic of playing");
    }

    @Override
    public void pause() {
        System.out.println("Sony logic of pausing");
    }
}
