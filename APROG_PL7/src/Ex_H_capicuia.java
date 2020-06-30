


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
import java.util.Scanner;
public class Ex_H_capicuia {
    public static void main (String[] arg){
        int num;
        
        Scanner sc = new Scanner(System.in);

        for (int x=1; x<=5;x++){
            num = sc.nextInt();
            
                
            if (capicua(num)){
                System.out.println("capicua");
                x=6;
            }else if(x==5){
                System.out.println("tentativas excedidas");
            }
        
        }
    }
    
    
    public static boolean capicua (int num){
        int inv;
        boolean result;
        if (num>10){
            inv = invertido(num);
        
            result = num == inv;
        }else{
            result = false;
        }
        return result;
    }
    public static int invertido (int num){
        int ivt, result;
        ivt = 0;
        do{
            result = num % 10;
            num = num / 10;
            ivt = ivt * 10 + result;
        }while(num != 0);
        return ivt;
    }
}
