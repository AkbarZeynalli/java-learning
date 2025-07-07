import java.util.Scanner;

public class Questions1 {


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Kiloqramınızı daxil edin: ");
        double inputKg = scanner.nextDouble();
        System.out.print("Boyunuzu daxil edin: ");
        double inputHeight = scanner.nextDouble();
        double bodyMassIndex = inputKg/Math.pow(inputHeight/100,2);
        System.out.println(bodyMassIndex);
        if (bodyMassIndex<15){
            System.out.println("Çox ciddi dərəcədə az kilolu");
        } else if (bodyMassIndex>=15 &&16>=bodyMassIndex) {
            System.out.println("Ciddi dərəcədə az kilolu");
        } else if (bodyMassIndex>16&&18.5>=bodyMassIndex) {
            System.out.println("Az kilolu");
        } else if (bodyMassIndex>18.5&&bodyMassIndex<=25) {
            System.out.println("Normal(sağlam) kilolu");
        } else if (bodyMassIndex>25 &&bodyMassIndex<=30) {
            System.out.println("çox kilolu");
        } else if (bodyMassIndex>30 &&bodyMassIndex<=35) {
            System.out.println("1. dereceden(yüngül) obez xestesi");
        } else if (bodyMassIndex>35 &&bodyMassIndex<=40) {
            System.out.println("2. deereceden(ciddi) obez xestesi");
        }else{
            System.out.println("3. dereceden(Çox ciddi) obez xestesi");
        }
    }
}
