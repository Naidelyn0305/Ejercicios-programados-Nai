 import java.util.Scanner;
 public class comparar {
    public static void main (String [] args ){
 
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un numero de 0 hasta 9999");
    int num  = input.nextInt();
     if (num>0 || num<10){ 
      System.out.println("El nuemero "+num+"es de una cifra");
      }
     else if (num>10 || num<100) {
     System.out.println("El nuemero "+num+"es de dos cifras");
     }
     else if (num>100 || num<1000){
     System.out.println("El nuemero "+num+"es de tres cifras");
    }
    else if (num>1000 || num<10000){
      System.out.println("El nuemero "+num+"es de cuatro cifras");
    }
    else if (num<10000){
      System.out.println("El nuemero "+num+"es mayor a cuatro cifras");
    }
    }
   
 }