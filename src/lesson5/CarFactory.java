package lesson5;

public class CarFactory {
    public static Zhiguli createZhiguli() {
        return new Zhiguli();
    }
    public static Toyota creatToyota() {
        return new Toyota();
    }

}
