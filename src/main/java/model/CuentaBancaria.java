package model;

import java.util.Date;

public abstract class CuentaBancaria {
	private String numeroCuenta;
	private Date fechaApertura;
	private int saldo;
	private SucursalBancaria sucursalBancaria;
	private Cliente cliente;

	public abstract String getTipo();

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public SucursalBancaria getSucursalBancaria() {
		return sucursalBancaria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public abstract	void mostrarDetallesCuenta();

	public CuentaBancaria(String numeroCuenta, Cliente cliente, SucursalBancaria sucursalBancaria) {
		this.numeroCuenta=numeroCuenta;
		this.fechaApertura= new Date();
		this.saldo= 0;
		this.cliente=cliente;
		this.sucursalBancaria=sucursalBancaria;

	}
}