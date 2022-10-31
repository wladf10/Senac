
package uc6_atividade1_parte3_v2;

import java.util.Scanner;

/**
 *
 * @author wfran
 */
public class UC6_atividade1_parte3_v2 {

    
    public static void main(String[] args) {
       Scanner entrada = new  Scanner (System.in);
       double diaria ,  total = 0;
       String nomeHospede = "";
       int idade, contNovo=0, contVelho=0;
       
       System.out.print("Digite o valor da diária: R$ ");
       diaria = entrada.nextFloat();
        
      do{
          System.out.println("Digite o nome do hóspede ou Digite PARE para concluir o sistema: ");
            nomeHospede = entrada.next();
            
            if (nomeHospede.equals("PARE")){
                break;
            }
            System.out.println("Digite a idade do hóspede: ");
            idade = entrada.nextInt();
            if (idade<4){
                System.out.println("Hóspede " + nomeHospede + " Possui Gratuidade na diária");
                contNovo = contNovo +1;
                total += 0;
            }
            else if (idade > 80){
                System.out.println("Hóspede " + nomeHospede +" paga metade da diária");
                contVelho = contVelho +1;
                total += diaria /2;
            }
            else if (idade >= 4 || idade <= 80){
                total += diaria;  
            }
      } while (!nomeHospede.contentEquals("PARE"));
       System.out.println("Valor Total das Hospedagens é R$ " + total + " sendo: "+ contNovo +" hospedagem gratuita e " + 
                ""+ contVelho +" hospedagem paga meia diária" );
       
       
    }
}