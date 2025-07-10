package Video30;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Video30Questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Sual1:
//        int sum = 0;
//        for (int i = 1;i<=3;i++){
//            System.out.print(i+" Reqemi daxil edin: ");
//            sum += scanner.nextInt();
//        }
//        System.out.print("Daxil edilən ədədlərin ortalaması: "+(sum/3));

//        Sual2: klaviaturadan kənarları girilən bir üçbucağın növünü verən bir proqram yazın
//        System.out.print("Üçbucağın 1. tərəfini daxil edin: ");
//        float first = scanner.nextFloat();
//        System.out.print("Üçbucağın 2. tərəfini daxil edin: ");
//        float second = scanner.nextFloat();
//        System.out.print("Üçbucağın 3. tərəfini daxil edin: ");
//        float three = scanner.nextFloat();
//        if (first == second && first ==three){
//            System.out.println("Bu üçbucaq bərabərtərəfli üçbucaqdır.");
//        } else if (first ==second ||first ==three ||second ==three) {
//            System.out.println("Bu üçbucaq bərabəryanlı üçbucaqdır.");
//        }else {
//            System.out.println("Bu üçbucaq müxtəliftərəfli üçbucaqdır.");
//        }


//        Sual3:
//        System.out.print("Vize notunu giriniz: ");
//        double vize = scanner.nextDouble();
//        System.out.print("Final notunu giriniz: ");
//        double finalNotu = scanner.nextDouble();
//        // Ortalama hesablanır
//        double ortalama = (vize * 0.4) + (finalNotu * 0.6);
//        // Nəticəyə baxılır
//        System.out.println("Ortalama: " + ortalama);
//        if (ortalama >= 50) {
//            System.out.println("Tebrikler, dersi geçtiniz.");
//        } else {
//            System.out.println("Maalesef, dersten kaldınız.");
//        }


//        Sual4:Kendi adınızı ekrana 5 kere yazdıran uygulamayı tüm döngülerle yapınız.
//        System.out.print("Adinizi daxil edin: ");
//        String firstName = scanner.nextLine();
//        for (int i = 1;i<=5;i++){
//            System.out.println("for ilə Adınız: "+firstName);
//        }
//        int whileCount = 1;
//        while (whileCount <=5){
//            System.out.println("while ilə Adınız: "+firstName);
//            whileCount++;
//        }
//        int doCount= 1;
//        do {
//            System.out.println("Do-While ilə Adınız: "+firstName);
//            doCount++;
//        }while (doCount<=5);


//        Sual5:1’den 100’e kadar olan sayıların toplamını bulan uygulamayı yazınız.
//        int sum= 0;
//        for (int i = 1;i<=100;i++){
//            sum+=i;
//        }
//        System.out.println("1’den 100’e kadar olan sayıların toplamı: "+sum);

//        Sual6:1’den 10a kadar olan sayıları sıra ile ve aralarında virgül olacak şekilde yazan bir
//        uygulamayı for döngüsü ile yazınız. 1,2,3,........ 10
//        for (int i =1;i<=10;i++){
//            System.out.print(i);
//            if (i !=10){
//                System.out.print(",");
//                continue;
//            }
//        }

//        Sual7:Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.
//        System.out.print("Zəhmət olmasa rəqəm daxil edin: ");
//        int inputNumber = scanner.nextInt();
//        int sum =1;
//        for (int i=1;i<=inputNumber;i++){
//            sum *=i;
//        }
//        System.out.println("daxil edilən ədədin faktorialı: "+sum);


//        sual8:Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için hesaplayınız.
//        System.out.print("X ədədini daxil edin: ");
//        float inputX = scanner.nextFloat();
//        System.out.print("Y ədədini daxil edin: ");
//        float inputY = scanner.nextFloat();
//        float fXY = 0;
//        if (inputX>0 && inputY<0){
//            fXY = (4*inputX)+(2*inputY)+4;
//            System.out.print(" x>0, y<0 ise f(x,y): "+fXY);
//        } else if (inputX>0 && inputY ==0) {
//            fXY = (2*inputX)-inputY+3;
//            System.out.print(" x>0, y=0 ise f(x,y): "+fXY);
//        } else if (inputX < 0 && inputY>0) {
//            fXY = (3*inputX)+(4*inputY)+3;
//            System.out.println(" x<0, y>0 ise f(x,y): "+fXY);
//        }

//        Sual9:100lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız
//        System.out.print("Imtahan balınızı daxil edin: ");
//        int inputExamResult = scanner.nextInt();
//        if (inputExamResult<51){
//            System.out.println("İmtahandan kəsilmisiniz.");
//        } else if (inputExamResult<61) {
//            System.out.println(inputExamResult+" Bal toplayaraq imtahandan E almsınız.");
//        } else if (inputExamResult<71) {
//            System.out.println(inputExamResult+" Bal toplayaraq imtahandan D almsınız.");
//        }
//        else if (inputExamResult<81) {
//            System.out.println(inputExamResult+" Bal toplayaraq imtahandan C almsınız.");
//        }else if (inputExamResult<91) {
//            System.out.println(inputExamResult+" Bal toplayaraq imtahandan B almsınız.");
//        }else {
//            System.out.println("Təbriklər. imtahandan "+inputExamResult+" bal toplayaraq A aldınız.");
//        }


//        Sual10:Çarpım tablosunu oluşturan bir uygulama yazınız.
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%4d", i);
//        }
//        System.out.println();
//        System.out.println("   ------------------------------------------");
//        // Cədvəl
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%3d |", i);  // Sətir nömrəsi
//            for (int j = 1; j <= 10; j++) {
//                System.out.printf("%4d", i * j);
//            }
//            System.out.println();
//        }


//        Sual11:
//        Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
//        etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
//        Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
//        sonra bulduğunu belirtelim.
//        int randomNumber = (int)(Math.random()*100+1);
//        System.out.println("Sistem 100 e qeder bir reqem tapdı");
//        int texminOlunanEded;
//        int texminOlunmaSayı = 0;
//        do {
//            System.out.print("Zehmet olmasa bir deyer girin: ");
//            texminOlunanEded = scanner.nextInt();
//            texminOlunmaSayı++;
//            if (texminOlunanEded<randomNumber){
//                System.out.println("Daha böyük bir reqem girin!");
//            } else if (texminOlunanEded>randomNumber) {
//                System.out.println("Daha kiçik bir reqem girin!");
//            }else {
//                System.out.println("Təbriklər, Doğru tapdınız :)");
//                System.out.println("Toplam "+texminOlunmaSayı+" defeye tapdınız");
//            }
//        }
//        while (texminOlunanEded !=randomNumber);
    }
}
