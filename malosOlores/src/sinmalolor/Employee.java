/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import conmalolor.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public abstract class Employee
{   
    protected float rmu = 386.0f;
    //salario del employee
    protected float salary;
    //porcentaje de bonus
    protected float bonusPercentage;    
    //porcentaje de bono
    protected float bonus;

       
    public Employee(float salary, float bonusPercentage, float bonus)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;           
        this.bonus = bonus;
    }    
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public abstract float cs();
    //calcula el bonus anual
    
    public abstract float calcularSalario(int month);

    @Override
    public String toString() {
        return "Employee{" + "rmu=" + rmu + ", salary=" + salary + ", bonusPercentage=" + bonusPercentage + ", bonus=" + bonus + '}';
    }
    
}
