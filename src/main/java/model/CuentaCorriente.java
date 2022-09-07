package model;

public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public String getTipo() {
		return "Cuenta Corriente";
	}
	public void mostrarDetallesCuenta(){
		String detalleCuenta= "Cliente " + super.getCliente().getNombre() +" "+ this.getTipo() +
				", N° de cuenta "+super.getNumeroCuenta() + ", saldo: "+
				super.getSaldo() + ", línea sobregiro: "+this.getLineaSobregiro();
		System.out.println(detalleCuenta);
	}
	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public CuentaCorriente(String numeroCuenta, int lineaSobregiro, Cliente cliente, SucursalBancaria sucursalBancaria) {
		super(numeroCuenta,cliente,sucursalBancaria);
		this.lineaSobregiro = lineaSobregiro;
	}
}