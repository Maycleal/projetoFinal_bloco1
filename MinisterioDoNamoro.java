package projetoFinal_bloco1;

import java.util.Scanner;

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
	                
                    String vetorCaracter1[] = new String[5];
	                
	                for(int indice = 0; indice < 5; indice ++) {
	                    System.out.println("Digite a " + (indice + 1)  +"º característica que você procura no seu parceiro: ");
	                    vetorCaracter1[indice] = leia.next();
	                }
	                
	                System.out.println("\nAs caracteristicas digitas foram: \n");
	                
	                for(int indice = 0; indice < 5; indice++) {
	                    System.out.println(vetorCaracter1[indice]);
	                }
	                              
	                break;
	            
	            case 2:
	                System.out.println("Você escolheu namorar mulheres.");
	                
                      String vetorCaracter2[] = new String[5];
	                
	                for(int indice = 0; indice < 5; indice ++) {
	                    System.out.println("Digite a " + (indice + 1)  +"º característica que você procura na sua parceira: ");
	                    vetorCaracter2[indice] = leia.next();
	                }
	                
	                System.out.println("\nAs caracteristicas digitas foram: \n");
	                
	                for(int indice = 0; indice < 5; indice++) {
	                    System.out.println(vetorCaracter2[indice]);
	                }	               
	                break;
	                
	            case 3:
	                System.out.println("Você escolheu namorar homens e mulheres.");
	                
	                String vetorCaracter3[] = new String[5];
	                
	                for(int indice = 0; indice < 5; indice ++) {
	                    System.out.println("Digite a " + (indice + 1)  +"º característica que você procura no seu parceiro(a): ");
	                    vetorCaracter3[indice] = leia.next();
	                }
	                
	                System.out.println("As caracteristicas digitas foram: ");
	                
	                for(int indice = 0; indice < 5; indice++) {
	                    System.out.println(vetorCaracter3[indice]);
	                }
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
    
    
   