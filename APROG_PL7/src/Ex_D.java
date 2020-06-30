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
public class Ex_D {
    public static void main (String[] arg){
        int x, y, r1, r2;
        double comb, perm;
        Scanner sc = new Scanner (System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
     if(x>0 && y>0){
        comb = combinacao(x,y);
        perm = permutacao(x,y);
        r1 = (int) comb;
        r2 = (int) perm;
        System.out.println("C("+x+","+y+")="+r1); //saída com o resultado da combinação e quais foram os números lidos
        System.out.println("P("+x+","+y+")="+r2); //saída com o resultado da permutação e quais foram os números lidos
     }
    }
    
//==============================================================================    
    public static double fatorial (double num){ //calcula o fatorial de 1 número
        double result = 1;
        while(num>1){
            result = result*num;
            num--;
        }
        return result;
    }
//==============================================================================    
    public static double combinacao (double x, double y){ //calcula a combinação de 2 números
        double result, m, n, mn;
        result = 1;
        if(x!=y){
            if (x>y){ //determina qual dos dois números é o maior para calculara a subtração
                m=x;
                n=y;
            }else{
                m=y;
                n=x;
            }
            mn = m-n;
            result = (fatorial(m)/(fatorial(n)*fatorial(mn)));
        }
        return result;
    }
//==============================================================================
    public static double permutacao (double x, double y){ //calcula a permutação de 2 números
        double result, m, n, mn;
        if (x>=y){ //determina qual dos dois números é o maior para calculara a subtração
           m=x;
           n=y;
        }else{
            m=y;
            n=x;
        }
        mn = m-n;
        result = (fatorial(m)/fatorial(mn));
        return result;    
        
    }    
}
