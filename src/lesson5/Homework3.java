package lesson5;

import java.io.*;
import java.util.Random;

public class Homework3 {


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
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Sony\\Desktop\\repos\\resource\\my_first_file.txt"));
        String result = "";
        while (bufferedReader.ready()) {
            result += bufferedReader.readLine() + " ";
        }
        bufferedReader.close();
        System.out.print(result);


        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300
        Financial_record financialRecord = new Financial_record(500, 300);
        String path = "C:\\Users\\Sony\\Desktop\\repos\\resource\\report.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write("доходы = " + financialRecord.getIncomes() + " , расходы " + financialRecord.getOutcomes());
        bufferedWriter.close();
        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
        Car[] cars = new Car[40];
        for (int i = 0; i < 40; i++) {
            if (i%2==0) {
                cars[i] = CarFactory.creatToyota();
            } else {
                cars[i] = CarFactory.createZhiguli();
            }
        }
        for (Car car : cars) {
            if (car instanceof Toyota) {
                Toyota car1 = (Toyota) car;
                car1.playMusic();
            } else if (car instanceof Zhiguli) {
                Zhiguli car1 = (Zhiguli) car;
                car1.breakDown();
            }
        }
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        Financial_record[] financialRecords = new Financial_record[10];
        Random random = new Random(1);
        for (int i = 0; i < financialRecords.length; i++) {
            int outcome = random.nextInt(10000);
            int income = random.nextInt(10000);
            financialRecords[i] = new Financial_record(income, outcome);
        }
        String pathReport = "C:\\Users\\Sony\\Desktop\\repos\\resource\\report_advance.txt";
        BufferedWriter writerAdvance = new BufferedWriter(new FileWriter(pathReport));
        String resultForAllRepords = "";
        for (Financial_record record : financialRecords) {
            resultForAllRepords+=record.toString() + "\n";
        }
        resultForAllRepords = resultForAllRepords.substring(0,resultForAllRepords.length()-1);
        writerAdvance.write(resultForAllRepords);
        writerAdvance.close();
        BufferedReader readerAdvance= new BufferedReader(new FileReader(pathReport));
        int totalIncome = 0;
        int totalOutcome = 0;
        while (readerAdvance.ready()) {
            String line = readerAdvance.readLine();
            String[] fields = line.split(";");
            int income = Integer.parseInt(fields[0]);
            int outcome = Integer.parseInt(fields[1]);
            totalIncome+=income;
            totalOutcome+=outcome;
        }
        System.out.println("общие доходы: " + totalIncome);
        System.out.println("общие расходы: " + totalOutcome);
        readerAdvance.close();
    }
}

