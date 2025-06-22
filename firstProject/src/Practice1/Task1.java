package Practice1;

import java.awt.*;

public class Task1 {
    public static void main(String[] args) {
        String stringSayi = "150";
//        System.out.println(stringSayi+ " Data Type: "+((Object) stringSayi).getClass().getSimpleName());
        int intDegisken = Integer.parseInt(stringSayi);
        System.out.println(intDegisken+ " Data Type: "+((Object) intDegisken).getClass().getSimpleName());
        String yenidenMetin = String.valueOf(intDegisken);
        System.out.println(yenidenMetin+ " Data Type: "+((Object) yenidenMetin).getClass().getSimpleName());
    }
}
