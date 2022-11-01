/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsortruen4a;


import java.util.Scanner;

/**
 *
 * @author David
 */
public class ShellSortruen4a {

    /**
     * @param matris
     * @param args the command line arguments
     */
    public static void shellsort(int[] matris){
        for (int incrementa = matris.length / 2; incrementa > 0; incrementa =
                (incrementa == 2)? 1 : (int) Math.round(incrementa / 2.2)) {
            for (int i = incrementa; i < matris.length; i++) {
                for (int j = i; j >= incrementa && matris[j- incrementa]> matris[j]; j-= incrementa) {
                    int temp = matris[j];
                    matris [j] = matris[j - incrementa];
                    matris [j - incrementa] = temp;
                    
                }
                
            }
            
        }
    }
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingresa El numero de elmentos que se van a idendentificar");
        int sca = valor.nextInt();
        int [] a= new int [sca];
        System.out.println("ingresa los valores a ordenar");
        for (int i = 0; i < sca; i++) {
            a[i]= valor.nextInt();
            
        }
        System.out.println("Resultado");
        shellsort(a);
        for (int i = 0; i < sca; i++) {
            System.out.println(+a[i]);
            
        }
    }
       
    }
