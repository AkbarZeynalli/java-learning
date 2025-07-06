package LoopingStatements;

public class LoopBreakexit {
    public static void main(String[] args) {

        //java da break mövzusunda ən vacib olan məqam etiketləmə di mənim fikrimcə çox səmərəli di çünki
        birincifor:
        for (int i = 0;i<5;i++){
                    System.out.println("Çöldəki for: "+i);
            ikincifor:
            for (int j = 0;j<3;j++){
                if (i==1 &&j ==2){
                    break birincifor;
                }
            }
        }
    }
}
