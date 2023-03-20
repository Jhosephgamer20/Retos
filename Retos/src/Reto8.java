import java.util.*;
public class Reto8 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        
        Random Aleatorio=new Random();

        int maquina=Aleatorio.nextInt();
                maquina=(int)(Math.random()*100+1);

        int numIntentos = 0;
        


        System.out.println("Digite el numero de intentos maximo 10");
        numIntentos =lectura.nextInt();

       

        int numero = 0;

        for(int i = 0; i < 10; i++){
             if(numIntentos > 10){
            System.out.println("Lo siento no puede jugar con esa cantidad de intentos");
            break;
        }
            System.out.println("Digite el numero: "+i);
            numero = lectura.nextInt();

            if(maquina != numero){
                numIntentos --;
                System.out.println("Se ha equivocado vuelvalo a intentar");
                System.out.println("sus intentos son "+numIntentos);

                if(maquina > numero){
                    System.out.println("El numero es mayor al ingresado");
            }else {
            System.out.println("el numero es menor al ingresado");
        }
         
        }else if(maquina == numero) {
            System.out.println("Usted ha ganado,sus intentos fueron: "+numIntentos);
            break;
    } if(numIntentos == 0){
        System.out.println("El numero era: "+maquina);
        break;
    }
    }   
    
    lectura.close(); 
}
}
