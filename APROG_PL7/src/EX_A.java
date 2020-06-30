/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *Inverte uma palavra inserida pelo utilizador
 * @author Marcel
 */
public class EX_A {
    public static void main (String[] arg){
        int qtd; char p; boolean flag;
        
        Scanner sc = new Scanner(System.in);
        flag= false; qtd=-1;
        
        do{
            String palavra = sc.next();
            String invertida = invertString(palavra);
            if (palavra.compareTo(invertida) ==0){
                flag = true;
            }
            qtd++;
        }while(flag !=true);
        System.out.println(qtd);
    }

//==============================================================================
    public static String invertString(String str) {
        String result = "";
        while (str.length() != 0) {
            result = str.charAt(0) + result;
            str = str.substring(1);
        }
        return result;
    }
}