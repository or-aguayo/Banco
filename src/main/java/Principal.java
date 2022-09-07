import model.Cliente;
import model.CuentaAhorro;
import model.CuentaCorriente;
import model.SucursalBancaria;

public class Principal {
    public static void inicializar(){
        //crea el objeto para gestionar el banco
        GestionBanco gestionBanco= new GestionBanco();
        //añade una sucursal a la gestión del banco
        gestionBanco.agregarSucursalBancaria(new SucursalBancaria("codigoSucursal","codigoPostal"));
        //añade dos clientes a la gestión del banco
        gestionBanco.agregarCliente(new Cliente("Oscar"));
        gestionBanco.agregarCliente(new Cliente("Raul"));
        //añade una cuenta corriente
        CuentaCorriente cuentaCorriente= new CuentaCorriente("numeroCuenta",100000,gestionBanco.buscarCliente("Oscar"),gestionBanco.getSucursalBancarias().get(0));
        gestionBanco.agregarCuentaBancaria(cuentaCorriente,gestionBanco.buscarCliente("Oscar"),gestionBanco.getSucursalBancarias().get(0));
        //añade una cuenta de ahorro
        CuentaAhorro cuentaAhorro= new CuentaAhorro("numeroCuenta",1.2,gestionBanco.buscarCliente("Raul"),gestionBanco.getSucursalBancarias().get(0));
        gestionBanco.agregarCuentaBancaria(cuentaAhorro,gestionBanco.buscarCliente("Raul"),gestionBanco.getSucursalBancarias().get(0));
        //muestra los datos de un cliente
        gestionBanco.visualizarCuentasCliente(gestionBanco.buscarCliente("Oscar"));


    }
    public static void main(String[] args) {
        inicializar();
    }
}
