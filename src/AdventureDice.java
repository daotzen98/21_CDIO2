import java.util.Scanner;

public class AdventureDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast navn: ");
        String spiller1 = Spiller.getName();

        System.out.println("Indtast navn: ");
        String spiller2 = Spiller.getName();


        System.out.println("Spiller 1: " + spiller1 + "\nSpiller 2: " + spiller2);


        System.out.println("Du har slået to");
        Konto.addSaldo(Felter.Tower());
        System.out.println(Felter.tower());

        System.out.println("Du har slået tre");
        Konto.addSaldo(Felter.Crater());
        System.out.println(Felter.crater());

        System.out.println("Du har slået fire");
        Konto.addSaldo(Felter.Palace_gates());
        System.out.println(Felter.palace_gates());

        System.out.println("Du har slået fem");
        Konto.addSaldo(Felter.Cold_desert());
        System.out.println(Felter.cold_desert());

        System.out.println("Du har slået seks");
        Konto.addSaldo(Felter.Walled_city());
        System.out.println(Felter.walled_city());

        System.out.println("Du har slået syv");
        Konto.addSaldo(Felter.Monastery());
        System.out.println(Felter.monastery());

        System.out.println("Du har slået otte");
        Konto.addSaldo(Felter.Black_cave());
        System.out.println(Felter.black_cave());

        System.out.println("Du har slået ni");
        Konto.addSaldo(Felter.Huts_in_the_mountain());
        System.out.println(Felter.huts_in_the_mountain());

        System.out.println("Du har slået ti");
        Konto.addSaldo(Felter.The_werewall());
        System.out.println(Felter.the_werewall());

        System.out.println("Du har slået elleve");
        Konto.addSaldo(Felter.The_pit());
        System.out.println(Felter.the_pit());

        System.out.println("Du har slået tolv");
        Konto.addSaldo(Felter.Goldmine());
        System.out.println(Felter.goldmine());





    }
}
