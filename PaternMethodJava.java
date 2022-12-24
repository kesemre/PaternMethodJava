import java.util.Scanner;

public class PaternMethodJava {

    static int patern(int number, int tempNumber, int i) {
        if (i <= 2 * ((double) number / 5) + 2) {
            System.out.print(tempNumber + " ");
            if (i <= ((double) number / 5)) {
                return patern(number, (int) (tempNumber - 5), i += 1);
            } else if (i >= (number / 5) && (double) i <= 2 * ((double) number / 5) + 1) {
                return patern(number, tempNumber + 5, i += 1);

            } else {
                return patern(number, tempNumber, i += 1);
            }

        } else return 0;

    }

    public static void main(String[] args) {
        int number, tempNumber, stopNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen patern sayısını giriniz");
        number = input.nextInt();
        tempNumber = number;
        patern(number, tempNumber, stopNumber);
    }
}