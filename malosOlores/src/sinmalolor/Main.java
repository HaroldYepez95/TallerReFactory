/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

/**
 *
 * @author Administrador
 */
public class Main {
    
    public static void main(String a[]){
        Worker w1 = new Worker(350.0f,0.5f,0.5f);
        
        Supervisor sp = new Supervisor(380.0f,0.5f,0.5f);
        
        Manager ma = new Manager(400.0f,0.5f,0.5f);
        
        System.out.println(w1);
        System.out.println("calculando salario w1: "+w1.cs());
        
        System.out.println(sp);
        System.out.println("calculando salario sp: "+sp.cs());
        
        System.out.println(ma);
        System.out.println("calculando salario ma: "+ma.cs());
    }
}
