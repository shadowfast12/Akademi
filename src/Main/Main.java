package Main;

import Algebra.Matrices;
import Algebra.Quadratics;
import Physics.Acceleration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        double[][]a = {
                {-1,-6},
                {1,-4},
        };
        double[][]b={
                {-5,-2},
                {6,0},
        };
        System.out.println(Arrays.deepToString(Matrices.Mult_Matrix(b,a)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}
