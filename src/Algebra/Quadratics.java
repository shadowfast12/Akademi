package Algebra;

public class Quadratics {

    public static String factor(int a, int b, int c){

        for(int i=a*c;i>0;i--){

            for(int x=a*c;x>a*c*-1;x--){
                if(i+x==b && i*x==c){
                    return "("+a+"x+"+i+")("+a+"x+"+i+")";
                }
            }
        }
        return "";
    }
}
