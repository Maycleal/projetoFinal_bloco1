package projetoFinal_bloco1;

public class Pessoa extends Usuario {

		
		    public Pessoa(String nome, int idade, String sexo, String local, String signo) {
		        super(nome, idade, sexo, local, signo);
		    }

		    
		    @Override
		    public void namorar() {
		        System.out.println("Muito obrigado(a) " + getNome() + "! Seus dados serão armazenados e logo estaremos achando seu par ideal!");
		    }
		}





