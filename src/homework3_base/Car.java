package homework3_base;

public abstract class Car {
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
