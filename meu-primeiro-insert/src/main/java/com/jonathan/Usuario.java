package com.jonathan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nome da sua tabela")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id automaticamente
	int id;
	
	@Column(length = 50,nullable = false) // coloca o tamanho e o que o valor nulo não será aceito 
	String nome;
	@Column(length = 11) // define o tamanho como 11
	
	String cpf; // exemplo
	
	  public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	
	
	
	
	
	
	
}
