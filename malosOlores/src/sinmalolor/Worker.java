/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Worker extends Employee{
    
    
    public Worker(float salary, float bonusPercentage, float bonus) {
        super(salary, bonusPercentage, 0);
    }
    
    
    @Override
    public float calcularSalario(int month){
        return month%2==0?salary:salary + rmu/12*2;
    }
    
    public float cs(){
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        return this.calcularSalario(month);
    }

    @Override
    public String toString() {
         return "Worker{" + "rmu=" + rmu + ", salary=" + salary + ", bonusPercentage=" + bonusPercentage + ", bonus=" + bonus + '}';
    }

    
    
}
