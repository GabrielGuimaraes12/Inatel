import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int aleatorio;
        Random rand = new Random();
        aleatorio = rand.nextInt(10)+1;
        System.out.println(aleatorio);
        do {
            System.out.println("Numero: ");
            numero = entrada.nextInt();
            if (numero<aleatorio){
                System.out.println("Menor");

            }
            else{
                System.out.println("maior");
            }


        }while(numero!=aleatorio);

        System.out.println("Acertou ! ");


    }
}
