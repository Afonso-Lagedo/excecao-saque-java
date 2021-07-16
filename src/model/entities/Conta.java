package model.entities;

public class Conta {
	
	private Integer numero;
	private String usuario;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta(Integer numero, String usuario, Double saldo, Double limiteSaque) {
		super();
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	

}
