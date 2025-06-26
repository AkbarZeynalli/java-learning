package Section3;

public class Task3 {
    public static void main(String[] args) {
        int year = 4100;
        boolean artikYilmi = (year % 400 ==0) || (year % 4 ==0 && year % 100 !=0);
        System.out.println("girilen il: "+year + "  artikyilmi: "+artikYilmi);
    }
}
