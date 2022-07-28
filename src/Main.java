import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
        task1();

    }

public static void task() {
    int[] array = new int[30];
    java.util.Random random = new java.util.Random();
    int min = 200000, max = 0;
    double sum=0;
    for (int i = 0; i < array.length; i++){
        array[i] = random.nextInt(100000) + 100000;
        if (min > array[i]) min = array[i];
        if (max < array[i]) max = array[i];}
    for (int i = 0; i < array.length; i ++) {
        array[i] = (int) (Math.random() * 100_000) + 100_000;
        sum += array[i];
    }
    System.out.println("Сумма трат за месяц составила: " + sum + " рублей. ");
    System.out.println("Минимальная сумма трат за день составила: " + min + " рублей." );
    System.out.println("Максимальная сумма трат за день составила: "   + max + " рублей. ");
    System.out.println("Средняя сумма трат за месяц составила: " + sum / 30 + " рублей. ");
}

    public static void task1() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
for  (int i = reverseFullName.length - 1; i > -1 ; i --) {
        System.out.print(reverseFullName[i]);}
    }
    }
