package lesson5;

public abstract class Cars {
    public void start() {
        System.out.println("начинает движение");
    }
    public void stop() {
        System.out.println("останавливается");
    }
    public void turnLights() {
        System.out.println("включает фары");
    }
}
