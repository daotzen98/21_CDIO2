import java.util.Scanner;

public class AdventureDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast navn: ");
        String spiller1 = Spiller.getName();

        System.out.println("Indtast navn: ");
        String spiller2 = Spiller.getName();


        System.out.println("Spiller 1: " + spiller1 + "\nSpiller 2: " + spiller2);

    }

}
