//pasar de millas marinas a metros
package boletin2.pkg5;

import java.util.Scanner;


public class Boletin25 {

    
    public static void main(String[] args) {
    float milla,metros=1850;
    
    System.out.print("millas =");
    Scanner dato= new Scanner(System.in);
    milla=dato.nextFloat();
    
    System.out.print("metros ="+ metros*milla);
    }
    
}
