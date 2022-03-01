import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAlunos;
        System.out.println("Numero de alunos: ");
        numeroAlunos = entrada.nextInt();
        switch (numeroAlunos){
            case 10:
            case 20:
                System.out.println("A aula sera na I-15");
            break;
            case 30:
                System.out.println("A aula sera na I-25");
            break;
            default:
                System.out.println("Numero incorreto de alunos");
            break;

        }







    }
}
