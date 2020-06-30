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
public class Ex_E {
    public static void main (String[] arg){
        int x, y,qtd, n, qtdant, xmaior, ymaior;
        Scanner sc = new Scanner(System.in);
        
        xmaior = 0; ymaior = 0; qtdant = 0;
        
        do{
            n = sc.nextInt();
        }while(n<=0);
        
        for(int b=1; b<=n;b++){
        
            x = sc.nextInt();
            y = sc.nextInt();
        
            qtd= iguais(x,y);
            
            if(qtdant<=qtd){
                qtdant=qtd; xmaior= x; ymaior = y;
            }
            
        }
        if(qtdant == 0){
            System.out.println("sem resultados");
        }else{
            System.out.println(xmaior+"/"+ymaior);
        }
        
        
    }
    public static int iguais (int x, int y){
       int result, digx, digy;
       result = 0;
       while(x>0 || y > 0){
           digx = x%10; digy = y%10;
           if(digx==digy){
               result++;
           }
           x = x/10; y = y/10;
       }  
        return result;
    }
}
