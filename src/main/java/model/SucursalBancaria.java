package model;

import java.util.ArrayList;
import model.CuentaBancaria;

public class SucursalBancaria {
	private String codigoSucursal;
	private String codigoPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public SucursalBancaria(String codigoSucursal, String codigoPostal) {
		this.codigoSucursal= codigoSucursal;
		this.codigoPostal= codigoPostal;
	}
}