public class Cat {
    // Задание №4
    // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
    // Написать к ним конструктор, сеттеры, геттеры.
    private String color;
    private int age;

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
