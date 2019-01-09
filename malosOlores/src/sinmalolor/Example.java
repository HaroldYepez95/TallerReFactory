/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import conmalolor.*;
import java.util.List;




public class Example {
    
    public List<Cliente> clientes;
    public List<Employee> empleados;
    
    public void MostrarInformacion(Cliente cliente){
        if(cliente.getNombre().equals("") && cliente.getNombre().length()> 16){
                System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");

        }
        if(cliente.getApellido().equals("") && cliente.getApellido().length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");

        }
        if(!cliente.getCedula().equals("") && cliente.getCedula().length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");

        }
        System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() + ", con numero de cedula: " + cliente.getCedula() );
        
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        if(Nombre.equals("") && Nombre.length()> 16){
                System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");

        }
        if(Apellido.equals("") && Apellido.length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");

        }
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");

        }
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + "ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        if(Nombre.equals("") && Nombre.length()> 16){
            System.out.println("ingreso de nombre incorrecto");
        }else{
            System.out.println("ingreso de nombre correcto");
            
        }
        if(Apellido.equals("") && Apellido.length()> 16){
            System.out.println("ingreso de apellido incorrecto");
        }else{
            System.out.println("ingreso de apellido correcto");
            
        }
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");
            
        }
        
    }
    
    
}
