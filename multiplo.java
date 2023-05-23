import java.util.Scanner;

public class multiplo {
   
    public static void main(String args [] ) {
        
        Scanner SC = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int a = SC.nextInt();
        System.out.println("Ingrese un número");
        int b = SC.nextInt();
        if (a % b == 0) {  
            System.out.println("El número: "+ b +" , es multiplo de: "+ a );

         } else {
            System.out.println("El número: "+ b +" , no es multiplo de: " + a );

        }
    }     
}