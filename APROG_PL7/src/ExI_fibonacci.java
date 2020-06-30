
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
public class ExI_fibonacci {
    public static void main (String[] arg){
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        if(fibo(n)){
            System.out.println("e de Fibonacci");
        }else{
            System.out.println("nao e de Fibonacci");
        }
    }
    
    
    public static boolean fibo(int num){
        int y,x1, x2, z;
            
        boolean result=false;
        y=0; x2=0;x1=x2;z=0; 
        while (x1<num && x2<num){
            if (y<2){
                x1=x2;
                x2=y;
                //y++;
                
            }else{    
                x2=x2+x1;
                
                x1=z;
            }
            //System.out.println(x1+","+x2+","+z);
            
            z = x2;
           y++;
            result = x2==num;
        }
        return result;
    }
}
