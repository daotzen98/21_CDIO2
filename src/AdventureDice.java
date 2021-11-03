import java.util.Scanner;

public class AdventureDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Spiller p1 = new Spiller();
        Spiller p2 = new Spiller();

        System.out.println("Spiller 1 navn: ");
        p1.name = sc.nextLine();
        System.out.println("Spiller 2 navn: ");
        p2.name = sc.nextLine();

        while (p1.konto < 3000 & p2.konto < 3000) {
            p1.roll();
            System.out.println(p1.name + " har slået " + Dice.getSum() + "\n" + p1.felt + "\nDu har nu " + p1.konto + " point!");
            sc.nextLine();

            p2.roll();
            System.out.println(p2.name + " har slået " + Dice.getSum() + "\n" + p2.felt + "\nDu har nu " + p2.konto + " point!");
            sc.nextLine();

        }
        if (p1.konto > p2.konto) {
            System.out.println(p1.name + " vandt!");
        }
        else System.out.println(p2.name + " vandt!");
    }
}
