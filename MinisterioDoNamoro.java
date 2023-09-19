package projetoFinal_bloco1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

    public class MinisterioDoNamoro {
	

		
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        System.out.println("S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2");
	    	System.out.println(".S2.S2.S2.S2...MINISTÉRIO DO NAMORO...S2.S2.S2.S2.S2.S2.");
	    	System.out.println("S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2");
	    	System.out.println("S2.S2.S2.S2.AQUI NINGUEM FICA SOZINHO..S2.S2.S2.S2.S2.S2");
	    	System.out.println("S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2.S2");
	    	System.out.println("S2.S2.S2.S2.S2...DIGITE SEU NOME:...S2.S2.S2.S2.S2.S2.S2");
	        String nome = leia.next();	        
	        System.out.println("S2.S2.S2.S2.S2...DIGITE SUA IDADE:..S2.S2.S2.S2.S2.S2.S2");
	        int idade = leia.nextInt();
	        System.out.println("S2.S2.S2.S2.S2...DIGITE SEU SEXO:...S2.S2.S2.S2.S2.S2.S2");
	        String sexo = leia.next();
	        System.out.println("S2.S2.S2.S2.S2...DIGITE SUA LOCALIDADE:...S2.S2.S2.S2.S2");
	        String local = leia.next();
	        System.out.println("S2.S2.S2.S2.S2...DIGITE SEU SIGNO:..S2.S2.S2.S2.S2.S2.S2");
	        String signo = leia.next();

	        if (idade < 18) {
                System.out.println("PROIBIDO PARA MENORES DE 18 ANOS.");
            } else {
                            
	       
	        Pessoa pessoa = new Pessoa(nome, idade, sexo, local, signo);

	    
	        System.out.println("S2.S2.S2.S2.S2...Escolha uma opção:..S2.S2.S2.S2.S2");
	        System.out.println("S2.S2.S2.S2.S2..(1) Namorar homens...S2.S2.S2.S2.S2");
	        System.out.println("S2.S2.S2.S2.S2..(2) Namorar mulheres.S2.S2.S2.S2.S2");
	        System.out.println("S2.S2.S2..(3) Namorar homens e mulheres.S2.S2.S2.S2");
	        System.out.println("S2.S2.S2.S2.S2.S2..(4) Sair.S2.S2.S2.S2.S2.S2.S2.S2");

	        int escolha = leia.nextInt();
	        

	      
	        switch (escolha) {
	            case 1:
	                System.out.println("Você escolheu namorar homens.");
	                
	                ArrayList<String> caracter = new ArrayList<String>();

	                int contador;

	                for(contador = 1; contador < 6; contador++) {
	                	System.out.println("\nDigite a " + contador + "º característica que você procura no seu parceiro: ");
	                	caracter.add(leia.next());
	                			
	                }

	                System.out.println("\nAs caracteristicas digitas foram: \n" + caracter);

	                Collections.sort(caracter);

	                System.out.println("\nA lista das caracteristicas ordenadas:\n" + caracter);
	                
	                              
	                break;
	            
	            case 2:
	                System.out.println("Você escolheu namorar mulheres.");
	                
	                ArrayList<String> caracter1 = new ArrayList<String>();

	                int contador1;

	                for(contador1 = 1; contador1 < 6; contador1++) {
	                	System.out.println("\nDigite a " + contador1 + "º característica que você procura na sua parceira: ");
	                	caracter1.add(leia.next());
	                			
	                }

	                System.out.println("\nAs caracteristicas digitas foram: \n" + caracter1);

	                Collections.sort(caracter1);

	                System.out.println("\nA lista das caracteristicas ordenadas:\n" + caracter1);
	                
	                break;
	                
	            case 3:
	                System.out.println("Você escolheu namorar homens e mulheres.");
	                
	                ArrayList<String> caracter2 = new ArrayList<String>();

	                int contador2;

	                for(contador2 = 1; contador2 < 6; contador2++) {
	                	System.out.println("\nDigite a " + contador2 + "º característica que você procura no seu parceiro(a): ");
	                	caracter2.add(leia.next());
	                			
	                }

	                System.out.println("\nAs caracteristicas digitas foram: \n" + caracter2);

	                Collections.sort(caracter2);

	                System.out.println("\nA lista das caracteristicas ordenadas:\n" + caracter2);
	                
	                break;
	                
	            case 4:
	            	System.out.println("Encerrando o programa.");
	            	break;
	            default:
	                System.out.println("Opção inválida. Tente novamente.");
	                return;
	        }

	        if (escolha != 4){
	        pessoa.namorar();
	        }
	    }
   
}
    } 
   
