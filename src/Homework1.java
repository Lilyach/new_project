public class Homework1 {
    //Продвинутый уровень
    //Задача №1
    //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
    public static void main(String[] args) {
        int number =Integer.parseInt("234");
        int lengthText = "some_text".length();
        System.out.println(number+lengthText);
    }
}
