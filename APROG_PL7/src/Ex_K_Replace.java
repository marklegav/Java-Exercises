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
public class Ex_K_Replace {
    public static void main (String[] arg){
        String frase1 , frase2, buscar, substituir;
        
        frase1 = null ; frase2 = null; substituir = null; buscar = null;
        Scanner sc = new Scanner(System.in);
        
        do{
            frase1 = sc.next();
        }while(frase1.length() == 0);
       
        do{
            buscar = sc.next();
        }while(buscar.length() == 0);
        
        System.out.println(buscar.length());
        substituir = sc.next();
        frase2 = frase1.replace(buscar,substituir);
        
        System.out.println(frase2);
        
        
        
    }
    
}
