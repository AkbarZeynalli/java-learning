import java.util.Scanner;

public class Questions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                   Azərlotereya Açıq Səhmdar Cəmiyyətinə xoş gəlmisiniz");

        System.out.print("Zəhmət olmasa iki rəqəmli ədəd daxil edin(XX):  ");
        int inputNumber = scanner.nextInt();
        int inputNumberFirstNumber = inputNumber/10;
        int inputNumberSecondNumber = inputNumber % 10;

        int randomNumber = (int)(Math.random()*100 +1);
        int randomNumberFirstNumber = randomNumber /10;
        int randomNumberSecondNumber = randomNumber %10;


        System.out.println("Daxil edilən Rəqəm: "+inputNumber);
        System.out.println("Verilən Random Rəqəm: "+randomNumber);


        if (inputNumber ==randomNumber){
            System.out.println("Təbriklər, Bizdən 10000AZN Pul qazandınız!");
        } else if (inputNumberFirstNumber ==randomNumberSecondNumber && inputNumberSecondNumber ==randomNumberFirstNumber) {
            System.out.println("Təbriklər,siz bizdən 5000AZN Pul qazandınız!");
        } else if (inputNumberFirstNumber==randomNumberFirstNumber||inputNumberSecondNumber ==randomNumberSecondNumber) {
            System.out.println("Təbriklər siz bizdən 1000AZN qazandınız");
        }
        else{
            System.out.println("Şansınızı birdaha sınayın");
        }
    }
}
