package com.senac.TalesEmissorMicroservico.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class MensagemZap implements Serializable {

	@Id
	@GeneratedValue
	private int usuario_id;
	private String usuario_nome;
	private String usuario_mensagem;

	public MensagemZap() {
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getUsuario_nome() {
		return usuario_nome;
	}

	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}

	public String getUsuario_mensagem() {
		return usuario_mensagem;
	}

	public void setUsuario_mensagem(String usuario_mensagem) {
		this.usuario_mensagem = usuario_mensagem;
	}
}
