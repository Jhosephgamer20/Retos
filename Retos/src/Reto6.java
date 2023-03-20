import java.util.*;
    public class Reto6 {
        public static void main(String arg[]) {

            Scanner lectura = new Scanner(System.in);
            String nombre;
            int apuesta = 0,respuesta=1, i = 0, saldo = 5000;

            Random moneda = new Random();
            
            int lanzar = (int)(Math.random()*2+1);
            int cae = 0;
            

            System.out.println("Digite el nombre");
            nombre = lectura.nextLine();

             
            
    while(respuesta == 1){
        System.out.println("Digite su apuesta");
            apuesta = lectura.nextInt();
        if(saldo >= apuesta){
            System.out.println("Elija cara o sello \n1-Cara \n2-Sello");
            cae = lectura.nextInt();

            if(lanzar == 1 && cae == 1){
                System.out.println("Felicidades ha ganado " +nombre+ " Usted ha ganado " +apuesta);
                saldo = apuesta * 2;
            }else if(lanzar == 2 && cae == 2){
                System.out.println("Felicidades ha ganado " +nombre+ " Usted ha ganado " +apuesta);
                saldo = apuesta * 2;
            }else {
                System.out.println("No ha ganado " +nombre+ " Usted ha perdido " +apuesta);
                saldo = saldo - apuesta;
            } 
            
            System.out.println("Usted ha ganado: "+saldo);

            System.out.println("Desea volver a jugar? 1-si 2-no");
            respuesta = lectura.nextInt();

        }else{
            System.out.println("Apuesta insuficiente");
        }
            
        }
        lectura.close();
         }
     }
