package conditionalStatements;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Zəhmət olmasa həftənin gününü daxil et: ");
        int daysOfTheWeek = scanner.nextInt();
        switch (daysOfTheWeek){
            case 1 :
                System.out.println("Həftənin 1 ci günüdür.");
                break;
            case 2:
                System.out.println("Həftənin 2 ci günüdür.");
                break;
            case 3:
                System.out.println("Həftənin 3 cü  günüdür.");
                break;
            case 4:
                System.out.println("Həftənin 4 cü günüdür.");
                break;
            case 5:
                System.out.println("Həftənin 5 ci günüdür.");
                break;
            case 6:
                System.out.println("Həftənin 6 cı günüdür.");
                break;
            case 7:
                System.out.println("Həftənin bazar günüdür.");
                break;
            default:
                System.out.println("ay emil heftede 7 gün var");
        }
    }
}
