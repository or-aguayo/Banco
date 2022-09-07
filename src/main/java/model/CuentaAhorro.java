package model;

public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public String getTipo() {
		return "Cuenta Ahorro";
	}
	public void mostrarDetallesCuenta(){
		String detalleCuenta= "Cliente " + super.getCliente().getNombre() +" "+ this.getTipo() +
				", N° de cuenta "+super.getNumeroCuenta() + ", saldo: "+
				super.getSaldo() + ", reajuste anual: "+this.getReajusteAnual();
		System.out.println(detalleCuenta);
	}
	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public CuentaAhorro(String numeroCuenta, double reajusteAnual, Cliente cliente, SucursalBancaria sucursalBancaria) {
		super(numeroCuenta,cliente,sucursalBancaria);
		this.reajusteAnual= reajusteAnual;
	}
}