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
public class Ex_J_advinha {
    public static void main (String[] arg){
        int num, vezes, gamer2, i;
        
        Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt();
        
        for ( i =1; i<=30; i++){ //imprimir 30 linhas vazias
            System.out.println("");
        }
        
        i=0;
        do{
            gamer2 = sc.nextInt(); //ler o número do jogador 2
            i++;
            if(gamer2 == num){
                System.out.println("Acertou");
                System.out.println(i);
            }else if(gamer2<= num){
                    System.out.println("Tente maior");
            }else {
                    System.out.println("Tente menor");
            }
            
            
        }while(gamer2!=num);
        
        
    }
     
}
