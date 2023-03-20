import java.util.Scanner;
public class Reto1{
    public  static void main (String []args){ 
        Scanner lectura=new Scanner(System.in);

        Double tempC, tempK;
        
        System.out.println("ingrese la temperatura en grados kelvin a convertir");
        tempK=lectura.nextDouble();
        tempC=tempK-273.15;
        System.out.println("la temperatura ingresada equivale a: "+tempC+" grados celsius");
    lectura.close();
    }
}