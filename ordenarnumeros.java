import java.util.*;
public class ordenarnumeros {
   
    
    public static void main(String [] args) {

        
        Scanner n = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int a = n.nextInt();
        System.out.println("Ingrese otro número");
        int b = n.nextInt();
        System.out.println("Ingrese otro número");
        int c = n.nextInt();
        if ((a>b) && (b>c)) {  
           System.out.println(" Orden de mayor a menor : "+a+" - "+b+"- "+c );
        }
        else if ((a>c) && (c>b)) { 
        System.out.println(" Orden de mayor a menor :  "+a+" - "+c+"- "+b );
    }     
    else if ((b>a) && (a>c)){ 
    System.out.println(" Orden de mayor a menor :  "+b+" - "+a+"- "+c );
    } 
    else if ((b>c) && (c>a)){ 
        System.out.println(" Orden de mayor a menor :   "+b+" - "+c+"- "+a );
    } 
    else if ((c>a) && (a>b)){ 
        System.out.println(" Orden de mayor a menor :   "+c+" - "+a+"- "+b );
   } 
   else {
    System.out.println(" Orden de mayor a menor :  "+c+" - "+b+"- "+a );

   }
 }
} 
