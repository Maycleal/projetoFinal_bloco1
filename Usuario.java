package projetoFinal_bloco1;

public abstract class Usuario {
	
	    private String nome;
	    private int idade;
	    private String sexo;
	    private String local;
	    private String signo;

	    public Usuario(String nome, int idade, String sexo, String local, String signo) {
	        this.nome = nome;
	        this.idade = idade;
	        this.sexo = sexo;
	        this.local = local;
	        this.signo = signo;
	    }
	  
	    public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public String getSigno() {
			return signo;
		}
		public void setSigno(String signo) {
			this.signo = signo;
		}
		
	    public abstract void namorar();
	}

	