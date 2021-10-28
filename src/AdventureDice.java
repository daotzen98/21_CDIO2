import java.util.Scanner;

public class AdventureDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();


        boolean inputOK = false;
        while (!inputOK) {
            System.out.println("Press 1 for danish or 2 for english");
            System.out.println("Tryk 1 for dansk eller 2 for engelsk");
            int sprog = sc.nextInt();
            if (sprog == 1) {
                System.out.println("Indtast navn på spiller 1: ");
                String input1 = sc.next();
                Spiller spiller1 = new Spiller(input1);

                System.out.println("Indtast navn på spiller 2: ");
                String input2 = sc.next();
                Spiller spiller2 = new Spiller(input2);
                inputOK = true;
                while (spiller1.getSaldo() <= 3000 & spiller2.getSaldo() <= 3000) {
                    do {
                        dice.roll1();
                        dice.roll2();
                        System.out.println("Tryk enter for at slå med terningen");
                        sc.nextLine();
                        System.out.println(spiller1.toName() + " du slog: " + Dice.getSum());
                        switch (Dice.getSum()) {
                            case 2:
                                spiller1.setSaldo(Felter.Tower());
                                System.out.println(FelterDansk.tower());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 3:
                                spiller1.setSaldo(Felter.Crater());
                                System.out.println(FelterDansk.crater());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 4:
                                spiller1.setSaldo(Felter.Palace_gates());
                                System.out.println(FelterDansk.palace_gates());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 5:
                                spiller1.setSaldo(Felter.Cold_desert());
                                System.out.println(FelterDansk.cold_desert());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 6:
                                spiller1.setSaldo(Felter.Walled_city());
                                System.out.println(FelterDansk.walled_city());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 7:
                                spiller1.setSaldo(Felter.Monastery());
                                System.out.println(FelterDansk.monastery());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 8:
                                spiller1.setSaldo(Felter.Black_cave());
                                System.out.println(FelterDansk.black_cave());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 9:
                                spiller1.setSaldo(Felter.Huts_in_the_mountain());
                                System.out.println(FelterDansk.huts_in_the_mountain());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 10:
                                spiller1.setSaldo(Felter.The_werewall());
                                System.out.println(FelterDansk.the_werewall());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 11:
                                spiller1.setSaldo(Felter.The_pit());
                                System.out.println(FelterDansk.the_pit());
                                System.out.println(spiller1.toStringDansk());
                                break;
                            case 12:
                                spiller1.setSaldo(Felter.Goldmine());
                                System.out.println(FelterDansk.goldmine());
                                System.out.println(spiller1.toStringDansk());
                                break;
                        }
                        if (spiller1.getSaldo() >= 3000) {
                            System.out.println(spiller1.toName() + " har vundet");
                            System.exit(0);
                        }
                    } while (Dice.getSum() == 10);
                    do {
                        dice.roll1();
                        dice.roll2();
                        System.out.println("Tryk enter for at slå med terningen");
                        sc.nextLine();
                        System.out.println(spiller2.toName() + " du slog: " + Dice.getSum());
                        switch (Dice.getSum()) {
                            case 2:
                                spiller2.setSaldo(Felter.Tower());
                                System.out.println(FelterDansk.tower());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 3:
                                spiller2.setSaldo(Felter.Crater());
                                System.out.println(FelterDansk.crater());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 4:
                                spiller2.setSaldo(Felter.Palace_gates());
                                System.out.println(FelterDansk.palace_gates());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 5:
                                spiller2.setSaldo(Felter.Cold_desert());
                                System.out.println(FelterDansk.cold_desert());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 6:
                                spiller2.setSaldo(Felter.Walled_city());
                                System.out.println(FelterDansk.walled_city());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 7:
                                spiller2.setSaldo(Felter.Monastery());
                                System.out.println(FelterDansk.monastery());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 8:
                                spiller2.setSaldo(Felter.Black_cave());
                                System.out.println(FelterDansk.black_cave());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 9:
                                spiller2.setSaldo(Felter.Huts_in_the_mountain());
                                System.out.println(FelterDansk.huts_in_the_mountain());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 10:
                                spiller2.setSaldo(Felter.The_werewall());
                                System.out.println(FelterDansk.the_werewall());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 11:
                                spiller2.setSaldo(Felter.The_pit());
                                System.out.println(FelterDansk.the_pit());
                                System.out.println(spiller2.toStringDansk());
                                break;
                            case 12:
                                spiller2.setSaldo(Felter.Goldmine());
                                System.out.println(FelterDansk.goldmine());
                                System.out.println(spiller2.toStringDansk());
                                break;
                        }
                        if (spiller2.getSaldo() >= 3000) {
                            System.out.println(spiller2.toName() + " har vundet");
                            System.exit(0);
                        }
                    } while (Dice.getSum() == 10);
                }
            }

            if (sprog == 2) {
                System.out.println("Enter name for player 1: ");
                String input1 = sc.next();
                Spiller spiller1 = new Spiller(input1);

                System.out.println("Enter name for player 2: ");
                String input2 = sc.next();
                Spiller spiller2 = new Spiller(input2);
                inputOK = true;
                while (spiller1.getSaldo() <= 3000 & spiller2.getSaldo() <= 3000) {
                    do {
                        dice.roll1();
                        dice.roll2();
                        System.out.println("Press enter to roll the dice");
                        sc.nextLine();
                        System.out.println(spiller1.toName() + " you rolled: " + Dice.getSum());
                        switch (Dice.getSum()) {
                            case 2:
                                spiller1.setSaldo(Felter.Tower());
                                System.out.println(FelterEngelsk.towerEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 3:
                                spiller1.setSaldo(Felter.Crater());
                                System.out.println(FelterEngelsk.craterEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 4:
                                spiller1.setSaldo(Felter.Palace_gates());
                                System.out.println(FelterEngelsk.palace_gatesEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 5:
                                spiller1.setSaldo(Felter.Cold_desert());
                                System.out.println(FelterEngelsk.cold_desertEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 6:
                                spiller1.setSaldo(Felter.Walled_city());
                                System.out.println(FelterEngelsk.walled_cityEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 7:
                                spiller1.setSaldo(Felter.Monastery());
                                System.out.println(FelterEngelsk.monasteryEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 8:
                                spiller1.setSaldo(Felter.Black_cave());
                                System.out.println(FelterEngelsk.black_caveEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 9:
                                spiller1.setSaldo(Felter.Huts_in_the_mountain());
                                System.out.println(FelterEngelsk.huts_in_the_mountainEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 10:
                                spiller1.setSaldo(Felter.The_werewall());
                                System.out.println(FelterEngelsk.the_werewallEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 11:
                                spiller1.setSaldo(Felter.The_pit());
                                System.out.println(FelterEngelsk.the_pitEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                            case 12:
                                spiller1.setSaldo(Felter.Goldmine());
                                System.out.println(FelterEngelsk.goldmineEN());
                                System.out.println(spiller1.toStringEngelsk());
                                break;
                        }
                        if (spiller1.getSaldo() >= 3000) {
                            System.out.println(spiller1.toName() + " has won");
                            System.exit(0);
                        }
                    } while (Dice.getSum() == 10);

                    do {
                        dice.roll1();
                        dice.roll2();
                        System.out.println("Press enter to roll the dice");
                        sc.nextLine();
                        System.out.println(spiller2.toName() + " you rolled: " + Dice.getSum());
                        switch (Dice.getSum()) {
                            case 2:
                                spiller2.setSaldo(Felter.Tower());
                                System.out.println(FelterEngelsk.towerEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 3:
                                spiller2.setSaldo(Felter.Crater());
                                System.out.println(FelterEngelsk.craterEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 4:
                                spiller2.setSaldo(Felter.Palace_gates());
                                System.out.println(FelterEngelsk.palace_gatesEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 5:
                                spiller2.setSaldo(Felter.Cold_desert());
                                System.out.println(FelterEngelsk.cold_desertEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 6:
                                spiller2.setSaldo(Felter.Walled_city());
                                System.out.println(FelterEngelsk.walled_cityEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 7:
                                spiller2.setSaldo(Felter.Monastery());
                                System.out.println(FelterEngelsk.monasteryEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 8:
                                spiller2.setSaldo(Felter.Black_cave());
                                System.out.println(FelterEngelsk.black_caveEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 9:
                                spiller2.setSaldo(Felter.Huts_in_the_mountain());
                                System.out.println(FelterEngelsk.huts_in_the_mountainEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 10:
                                spiller2.setSaldo(Felter.The_werewall());
                                System.out.println(FelterEngelsk.the_werewallEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 11:
                                spiller2.setSaldo(Felter.The_pit());
                                System.out.println(FelterEngelsk.the_pitEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                            case 12:
                                spiller2.setSaldo(Felter.Goldmine());
                                System.out.println(FelterEngelsk.goldmineEN());
                                System.out.println(spiller2.toStringEngelsk());
                                break;
                        }
                        if (spiller2.getSaldo() >= 3000) {
                            System.out.println(spiller2.toName() + " has won");
                            System.exit(0);
                        }
                    } while (Dice.getSum() == 10);
                }
            } else System.out.println("That's not a 1 or a 2\nHallo! Jeg sagde 1 eller 2!");
        }
    }
}
