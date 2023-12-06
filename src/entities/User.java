package entities;

import java.time.LocalDate;

public abstract class User {
	
	protected Long id;
	protected Long cpf;
	protected LocalDate nascimento;
	protected String nome;
	
	public User() {}
	
	
	public User(Long id, Long cpf, LocalDate nascimento, String nome) {
		
		this.id = id;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public LocalDate getNascimento() {
		return nascimento;
	}


	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
