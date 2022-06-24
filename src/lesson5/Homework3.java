package lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework3  {
    public static void main(String[] args) throws IOException {
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        Toyota toyota = new Toyota();
        Zhiguli zhiguli = new Zhiguli();
        toyota.playMusic();
        toyota.stop();
        zhiguli.breakDown();
        zhiguli.turnLights();


        //Задача №2
        //Необходимо:
        // 1. Создать папку resource, пометить ее как папку Resourсe root.
        // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        FileReader fileReader = new FileReader("C:\\Users\\Sony\\Desktop\\repos\\resource\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String result = bufferedReader.readLine();
            System.out.print(result + " ");
        }
        fileReader.close();


        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300
        Financial_record financialRecord = new Financial_record();
        FileWriter fileWriter = new FileWriter("C:\\Users\\Sony\\Desktop\\repos\\resource\\report.txt");
        fileWriter.write("доходы = " + Integer.toString(financialRecord.incomes) + " , расходы " + Integer.toString(financialRecord.outcomes));
        fileWriter.close();

    }
    }
