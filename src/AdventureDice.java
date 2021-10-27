import java.util.Scanner;

public class AdventureDice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();


        boolean inputOK = false;
        while (!inputOK){
            System.out.println("Press 1 for danish or 2 for english");
            System.out.println("Tryk 1 for dansk eller 2 for engelsk");
            int sprog = sc.nextInt();
            if (sprog == 1) {
                System.out.println("Indtast navn: ");
                String input1 = sc.next();
                Spiller spiller1 = new Spiller(input1);

                System.out.println("Indtast navn: ");
                String input2 = sc.next();
                Spiller spiller2 = new Spiller(input2);
                inputOK = true;
            while (inputOK == true){
                dice.roll1();
                dice.roll2();
                System.out.println(Dice.getSum());
                switch (Dice.getSum()) {
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesdat");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    case 5:
                        System.out.println("M5");
                        break;
                    case 6:
                        System.out.println("M6");
                        break;
                    case 7:
                        System.out.println("7");
                        break;
                    case 8:
                        System.out.println("8");
                        break;
                    case 9:
                        System.out.println("9");
                        break;
                    case 10:
                        System.out.println("10");
                        break;
                    case 11:
                        System.out.println("11");
                        break;
                    case 12:
                        System.out.println("12");
                        break;
                }

            }
            if (sprog == 2) {
                System.out.println("Enter name: ");
                String input1 = sc.next();
                Spiller spiller1 = new Spiller(input1);

                System.out.println("Enter name: ");
                String input2 = sc.next();
                Spiller spiller2 = new Spiller(input2);
                inputOK = true;
                break;
            }
            else System.out.println("Hallo! Jeg sagde 1 eller 2!\nThat's not a 1 or a 2");
        }
        do{
        dice.roll1();
        dice.roll2();
        System.out.println(Dice.getSum());
        switch (Dice.getSum()) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesdat");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("M5");
                break;
            case 6:
                System.out.println("M6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            case 12:
                System.out.println("12");
                break;
        }
        while (Spiller.ge)
        }
        
    }

}
