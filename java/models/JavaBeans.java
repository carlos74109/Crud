package models;

public class JavaBeans {
	String idcon;
	String nome;
	
	
	public JavaBeans() {
		super();
		
	}


	public String getIdcon() {
		return idcon;
	}


	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public JavaBeans(String idcon, String nome) {
		super();
		this.idcon = idcon;
		this.nome = nome;
	}
}
