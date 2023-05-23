import java.util.*;
public class númeromayor {
   
    public static void main(String args [] ) {
        
        Scanner n = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int a = n.nextInt();
        System.out.println("Ingrese un número");
        int b = n.nextInt();
        if (a<b) {  
            System.out.println("El número: "+ b +" , es mayor que: "+ a );

         } else {
            System.out.println("El número: "+ a +" , es mayor que: " + b );

        }
    }     
}