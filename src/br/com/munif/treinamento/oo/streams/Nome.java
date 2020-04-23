package br.com.munif.treinamento.oo.streams;

public class Nome{
	
	private String nome;
	
	private int frequencia;
	
	public Nome() {
		
	}
	
	public Nome(String n, int f) {
		setNome(n);
		setFrequencia(f);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	public String toString() {
		return nome+"("+frequencia+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + frequencia;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nome other = (Nome) obj;
		// poderia ser só isso return this.nome.equals(other.nome)
		if (this.nome.equals(other.nome)) {
			return true;
		}
		return false;
	}
	
	 
	
	
}
