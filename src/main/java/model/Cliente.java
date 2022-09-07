package model;

import java.util.ArrayList;
import model.CuentaBancaria;

public class Cliente {
	private String nombre;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente(String nombre) {
		this.nombre=nombre;
	}
}