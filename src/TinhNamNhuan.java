import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter Year ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d la nam nhuan ", year);
                } else {
                    System.out.printf("%d khong phai la nam nhuan", year);
                }

            } else {
                System.out.printf("%d la nam nhuan",year);
            }

        } else {
            System.out.printf( "%d khong phai la nam nhuan",year);
        }
    }
}
