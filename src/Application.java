import entities.Rent;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.print("how many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 1) {
            n = 1;
        }
        if (n > 10) {
            n = 10;
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #%d:\n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            if (rents[roomNumber] == null) {
                rents[roomNumber] = new Rent(name, email);
            }
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.printf("%d: %s\n",i, rents[i].toString());
            }
        }
        sc.close();
    }
}
