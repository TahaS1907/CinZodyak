import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int date;
        int zodiac;
        System.out.println("Enter your date of birth:");
        date= scanner.nextInt();
        zodiac=date%12;
        switch (zodiac){
            case 0:
                System.out.println("Your Chinese zodiac sign: Monkey");
break;
            case 1:
                System.out.println("Your Chinese zodiac sign: Cock");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign: Dog");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign: Pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign: Mouse");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign: Ox");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign: Tiger");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign: Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign: Dragon");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign: Snake");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign: Horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign: Sheep");
        }
    }
}