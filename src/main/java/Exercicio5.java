import java.util.Random;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int aleatorio;
        Random rand = new Random();
        aleatorio = rand.nextInt(10)+1;
        do {
            System.out.println("Numero: ");
            numero = entrada.nextInt();

        }while(numero!=aleatorio);

        System.out.println("Acertou ! ");



    }
}
