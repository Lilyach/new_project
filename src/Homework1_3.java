import java.util.Arrays;

public class Homework1_3 {
    //Создать два массив чисел:
    // 1,2,5,7,10
    // 2,3,2,17,15
    // Создать массив чисел, в котором будут: все числа из этих двух массивов,
    // и результат умножения чисел с одинаковым порядковым номером
    //
    //Ожидаемый результат:
    //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
    //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
    //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
    public static void main(String[] args) {
        int [] array1 = {1,2,5,7,10};
        int [] array2 = {2,3,2,17,15};
        int [] array3 = new int [15];
        array3[0] = array1[0];
        array3[1] = array1[1];
        array3[2] = array1[2];
        array3[3] = array1[3];
        array3[4] = array1[4];
        array3[5] = array2[0];
        array3[6] = array2[1];
        array3[7] = array2[2];
        array3[8] = array2[3];
        array3[9] = array2[4];
        array3[10] = array1[0]*array2[0];
        array3[11] = array1[1]*array2[1];
        array3[12] = array1[2]*array2[2];
        array3[13] = array1[3]*array2[3];
        array3[14] = array1[4]*array2[4];
        System.out.println(Arrays.toString(array3));

    }
}
