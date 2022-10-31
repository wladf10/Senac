package uc6_atividade1_parte2_v3;

import java.util.Scanner;

public class UC6_atividade1_parte2_v3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;
        System.out.println("Digite o nome do Hóspede 1 ");
        nome1 = entrada.nextLine();
        System.out.println("Digite a idade do Hóspede 1 ");
        idade1 = entrada.nextInt();

       
        System.out.println("Digite o nome do Hóspede 2 ");
        nome2 = entrada.next();
        System.out.println("Digite a idade do Hóspede 2 ");
        idade2 = entrada.nextInt();

        if (idade2 > idade1) {
            System.out.println("Hóspede " + nome2 + " está no quarto A, e Hóspede " + nome1+ " está no quarto B");
                   
        }
        else if (idade1 >idade2){
            System.out.println("Hóspede "+ nome1+ " está no quarto A, e Hóspede " + nome2+ " está no quarto B");
           
        }
        if (idade2 >= 60) {
            System.out.println("Hóspede " + nome2 + " recebe 40% de desconto como cortesia na diária para terceira idade");
        }
        if (idade1 >= 60) {
            System.out.println("Hóspede: " + nome1 + " recebe 40% de desconto na diária como cortesia para terceira idade");
        }

    }

}
