/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Marcel
 */
public class Ex_C {
    public static void main (String[] arg){
        double x, y, c, z, angAB, angAC, angBC;
        Scanner sc = new Scanner (System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        
        //if (x+y<z && y+z<x && x+z<y){
            angAB = calcAng( x, y, z);
            angAC = calcAng( x, z, y);
            angBC = calcAng( y, z, x);

            System.out.println("a="+x);
            System.out.println("b="+y);
            System.out.println("c="+z);
            System.out.println("ang (a,b)="+angAB);
            System.out.println("ang (a,c)="+angAC);
            System.out.println("ang (b,c)="+angBC);
        //}
    }       


    

    public static double calcAng (double a, double b, double c){
        double result;
        result = Math.acos((a*a) + (b*b) - (c*c)) / (2*a*b);

        return result; 
    }
}


