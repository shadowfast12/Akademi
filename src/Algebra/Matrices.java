package Algebra;


import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static Scanner in = new Scanner(System.in);

    //normal add+subtracting matrices solver
    public static void solve_matrix(){

        System.out.println("Welcome to the Matrices solver for addition and subtraction.\n" +
                " Make sure to convert fractions to decimals");

        System.out.print("Enter the alteration for the 1st Matrix: ");
        double f_altr = in.nextDouble();

        System.out.print("Enter the 1st Matrix with the commas & |: ");
        String subpart = in.next();
        subpart = ","+subpart+",";

        System.out.print("Enter the alteration for the 2nd Matrix: ");
        double s_altr = in.nextDouble();

        System.out.print("Enter the 2nd Matrix with the commas & |: ");
        String subpart2 = in.next();
        subpart2 = ","+subpart2+",";

        System.out.print(Arrays.toString(Matrix(nortoarr(f_altr,subpart), nortoarr(s_altr, subpart2))));

    }
    //converts the normal numbers into the new numbers with the subpart
    public static double[][] nortoarr(Double alter, String subpart){
        double[][] total;
        int count=0,x_count=0,start=0,rep=0,x_rep=0;

        for(int i=0; i<subpart.length(); i++){
            if(subpart.charAt(i)=='|'){
                count++;
            }
            if(subpart.charAt(i)==','){
                x_count++;
            }
        }
        total=new double[count][x_count];

        for(int x=0;x<subpart.length();x++){

            if(subpart.charAt(x)=='|'){
                x_count++;
                subpart=subpart.replaceFirst("l", ",");
            }
            if(subpart.charAt(x)==','){
                if(x!=0){
                    total[x_rep][rep]=Double.parseDouble(subpart.substring(start+1,x))*alter;
                    rep++;
                }
                start=x;
            }
        }

        return total;
    }

    public static void solve_mult_Matrices(){
        System.out.println("Welcome to the Matrices solver");
    }

    //multiplies the matrices
    public static double[][] Mult_Matrix(double[][] a, double[][] b){
        double[][] num;

        if(a[0].length==b.length){
            num=new double[b[0].length][a.length];

            for(int i=0;i<a.length;i++){
                for(int o=0;o<b[0].length;o++){
                    for(int x=0;x<a[0].length;x++){
                        num[i][o]+=a[i][x]*b[x][o];
                    }
                }
            }
            return num;
        }


        return null;
    }

    //if no alterations to the numbers, set the a_altr or b_altr to 1 not 0
    //if there's a negative symbol apply it to the alteration
    public static double[] Matrix(double[][] a, double[][] b){
        double[][] sum= new double[a[0].length][a.length];

        for(int i=0;i<a.length;i++){
            for(){
                sum[i]=a[i]+b[i];
            }
        }

        return sum;
    }
}
