import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int npa;
        int np3;
        System.out.println("Nota da prova: ");
        npa = entrada.nextInt();
        if (npa>=60){
            System.out.println("Aprovado");
        }
        else if (npa<30){
            System.out.println("Reprovado");
        }
            else{
            System.out.println("Nota NP3: ");
                np3 = entrada.nextInt();
                if ((np3+npa)/2>=50) {

                    System.out.println("Aprovado");
                }
                    else {
                        System.out.println("Reprovado");
                    }

        }




    }



}
