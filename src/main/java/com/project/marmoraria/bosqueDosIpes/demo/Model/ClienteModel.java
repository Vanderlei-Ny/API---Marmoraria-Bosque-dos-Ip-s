package com.project.marmoraria.bosqueDosIpes.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name ="clientes")
@Entity

public class ClienteModel {

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
public Long id;

private String nome;
private String telefone;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTelefone() {
	return telefone;
}
 
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

}
