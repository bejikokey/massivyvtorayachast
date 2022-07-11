import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {


        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.println( "Сумма трат за месяц " + total);

        int  min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println( "Минимальная сумма за месяц " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]);
            max = arr[i];
        }
        System.out.println( "Макимальная сумма за месяц " + max);



        double average = total/ arr.length;
        System.out.println( "Средняя сумма трат за месяц " + average);


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(100_000) + 100_000);
        }
        return arr;
    }
}


