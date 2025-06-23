public class Task2 {
    public static void main(String[] args) {
        int sayi1 = 5 / 3;
        float sayi2 = 5f /3f ;
        double sayi3 = 5d /3d;
        System.out.println(sayi1 + "| Data types: |" +((Object) sayi1).getClass().getSimpleName());
        System.out.println(sayi2+ "| Data types: |" + ((Object) sayi2).getClass().getSimpleName());
        System.out.println(sayi3 + "| Data Type: |"+ ((Object) sayi3).getClass().getSimpleName());
    }
}
