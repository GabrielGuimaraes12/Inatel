    import java.util.Scanner;
    public class Exercicio2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int partida1;
    int partida2;
    int partida3;
    int totalZumbis;
    int media;
    System.out.println("Primeira partida: ");
    partida1 = entrada.nextInt();
    System.out.println("Segunda partida: ");
    partida2 = entrada.nextInt();
    System.out.println("Terceira partida: ");
    partida3 = entrada.nextInt();

    totalZumbis = partida1+partida2+partida3;
    media = totalZumbis/3;

        System.out.println("Total de zumbis mortos: " + totalZumbis);
        System.out.println("Media: " + media);
    }


}
