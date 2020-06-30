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
public class EX_G_armstrong {
    public static void main (String[] arg){
        int n, num;
        
        Scanner sc = new Scanner (System.in);
        
        n= sc.nextInt();
        for(num = 0; num<=n;num++){
            //System.out.println(num);
                if (armstrong(num)){
                   System.out.println(num);
                }
                
        }
    }
    public static boolean armstrong (int num){
        boolean result;
        if(num<10){
            result =true;
        }else{
            result = exponencial(num) == num;
        }
    
 //       System.out.println(result);
        return result;
    }
    
    public static int exponencial (int num){
        int dig, exp, result, y;
        double x=0;
        exp = contdig(num);
        for (y=1;y<=exp;y++){
            dig = num%10;
//            System.out.println(num);
//            System.out.println(dig);
//            System.out.println(Math.pow(dig,exp));
            x = Math.pow(dig,exp)+x;
//            System.out.println(x);
            num = num/10;
        }
        result = (int) x;
//        System.out.println(result);
        return result;
    }
    public static int contdig(int num){
        int qt=0;
        do {
            num = num/10;
            qt++;
        }while(num!=0);
//        System.out.println(qt);
        return qt;
    }
}
