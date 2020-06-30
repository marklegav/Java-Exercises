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
public class EX_B {
    public static void main (String[] arg){
        int alunos, materias, posi, neg, x, y;
        String disciplina, positivas, negativas;
        
        Scanner sc = new Scanner (System.in);
        
        alunos = sc.nextInt();
        materias = sc.nextInt();
        
        for(x=1; x<=materias; x++){
            disciplina = sc.next();
            posi = sc.nextInt();
            neg = alunos - posi;


            positivas = grafico(posi);
            negativas = grafico(neg);
            System.out.println("Disciplina: "+disciplina);
            System.out.println("- Positivas: "+positivas);
            System.out.println("- Negativas: "+negativas);
            
        }
        
    }
//==============================================================================
    public static String grafico(int qtd ){
        String result = "";
        
        for (int y = 1; y<=qtd; y++){
            result = "*" + result;
        }

        return result;
    }
    
}
