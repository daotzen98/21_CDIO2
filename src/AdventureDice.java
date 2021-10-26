import java.util.Scanner;

public class AdventureDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast navn: ");
        String input1 = sc.next();
        Spiller spiller1 = new Spiller(input1);

        System.out.println("Indtast navn: ");
        String input2 = sc.next();
        Spiller spiller2 = new Spiller(input2);

        System.out.println("Spiller 1: " + spiller1 + "\nSpiller 2: " + spiller2);
        spiller1.setSaldo(Felter.Crater());
        System.out.println(Felter.crater() + spiller1.getSaldo());
        spiller2.setSaldo(Felter.Tower());
        System.out.println(Felter.tower() + spiller2.getSaldo());
        System.out.println("Spiller 1: " + spiller1 + "\nSpiller 2: " + spiller2);
    }

}
