import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestionBanco {
    private List<Cliente> clientes;
    private List<SucursalBancaria> sucursalBancarias;

    public GestionBanco() {
        this.clientes = new ArrayList<Cliente>();
        this.sucursalBancarias = new ArrayList<SucursalBancaria>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<SucursalBancaria> getSucursalBancarias() {
        return sucursalBancarias;
    }

    public Cliente agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
        return cliente;
    }
    public SucursalBancaria agregarSucursalBancaria(SucursalBancaria sucursalBancaria){
        this.sucursalBancarias.add(sucursalBancaria);
        return sucursalBancaria;
    }

    //sirve para las cuentas de ahorro y corriente
    public CuentaBancaria agregarCuentaBancaria(CuentaBancaria cuentaBancaria, Cliente cliente, SucursalBancaria sucursalBancaria){
        //asocia la cuenta con el cliente
        cliente.getCuentasBancarias().add(cuentaBancaria);
        //asocia la cuenta con el banco
        sucursalBancaria.getCuentasBancarias().add(cuentaBancaria);
        return cuentaBancaria;
    }

    public void visualizarCuentasCliente(Cliente cliente){
        for(CuentaBancaria cuentaBancaria : cliente.getCuentasBancarias()){
            cuentaBancaria.mostrarDetallesCuenta();
        }
    }
    public List<CuentaAhorro> obtenerCuentasAhorro(SucursalBancaria sucursalBancaria){
        List<CuentaAhorro> cuentasAhorro = new ArrayList<CuentaAhorro>();
        for(CuentaBancaria cuentaBancaria : sucursalBancaria.getCuentasBancarias()){
            if(cuentaBancaria.getTipo().equals("Cuenta Ahorro")){
                cuentasAhorro.add((CuentaAhorro) cuentaBancaria);
            }
        }
        return cuentasAhorro;
    }
    public List<CuentaCorriente> obtenerCuentasCorriente(SucursalBancaria sucursalBancaria){
        List<CuentaCorriente> cuentasCorriente = new ArrayList<CuentaCorriente>();
        for(CuentaBancaria cuentaBancaria : sucursalBancaria.getCuentasBancarias()){
            if(cuentaBancaria.getTipo().equals("Cuenta Ahorro")){
                cuentasCorriente.add((CuentaCorriente) cuentaBancaria);
            }
        }
        return cuentasCorriente;
    }
     public Cliente buscarCliente(String nombre){
        for(Cliente cliente : this.clientes){
            if(cliente.getNombre().equals(nombre)){
                return cliente;
            }
        }
        //en caso de que no encuentre ningún cliente con un determinado nombre, retorna un valor nulo
        return null;
     }

}
