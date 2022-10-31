
package uc6_atividade1_parte1;

import java.util.Scanner;


public class UC6_atividade1_parte1 {

   
    public static void main(String[] args) {
          
        Scanner entrada = new Scanner (System.in);
        
        int qtd_convidados;
        int resultado;
       
        
        System.out.println("Ecreva quantidade de convidados: ");
         qtd_convidados = entrada.nextInt();
         resultado = (qtd_convidados-150);
         
            if(qtd_convidados >=1 && qtd_convidados<=150)
            {
            System.out.println("Utilize o  Auditório Alfa");
            }
            else
            {
            if(qtd_convidados >150 && qtd_convidados <=220) 
            {
             System.out.println("Utilize o Auditório Alfa adicionando mais: " +resultado + " Cadeiras");
            }
            else
            {
            if(qtd_convidados >220 && qtd_convidados <=350) 
            {
             System.out.println("Utilize o Auditorio Beta");
            }
            else 
            {
            if (qtd_convidados <1 || qtd_convidados >350)    
            {
            System.out.println("Número de convidados é invalido.  ");
            }
            
        }
    }
}
}
}