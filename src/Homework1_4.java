public class Homework1_4 {
    //Задача №4
    //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
    public static void main(String[] args) {
        String phrase = "Hello world!";
        String phrase1 = phrase.replace('l', 'r').toUpperCase();
        System.out.println(phrase1.substring(0,7));
    }
}
