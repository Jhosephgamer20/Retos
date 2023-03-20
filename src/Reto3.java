import java.util.*;
    public class Reto3 {
        public static void main(String arg[ ]) {

            Scanner datos = new Scanner(System.in);
            String nombre;
            int apuesta = 0;

            Random moneda = new Random();
            
            int lanzar = (int)(Math.random()*2+1);
            int cae = 0;
            

            System.out.println("Digite el nombre");
            nombre = datos.nextLine();

            System.out.println("Digite su apuesta");
            apuesta = datos.nextInt();

            System.out.println("Elija cara o sello \n1-Cara \n2-Sello");
            cae = datos.nextInt();

            if(apuesta < 10000){
                System.out.println("Lo siento no puede jugar");
            }else if(lanzar == 1 && cae == 1){
                System.out.println("Felicidades ha ganado " +nombre+ " Usted ha ganado " +apuesta);
            }else if(lanzar == 2 && cae == 2){
                System.out.println("Felicidades ha ganado " +nombre+ " Usted ha ganado " +apuesta);
            }else {
                System.out.println("No ha ganado " +nombre+ " Usted ha perdido 2nn" +apuesta);
            }
           datos.close();
         }
     }
