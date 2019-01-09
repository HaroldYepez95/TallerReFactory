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
public class Supervisor extends Employee implements ICalculable {

    public Supervisor(float salary, float bonusPercentage, float bonus) {
        super(salary, bonusPercentage, bonus);
    }
    
     
    
    
    @Override
    public float calcularSalario(int month){
        float valueS = salary + (bonusPercentage * bonus);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
        return month%2==0?valueS:valueS + rmu/12*2;
    }
    @Override
    public float CalculateYearBonus() 
    {
        return salary + salary * 0.7F;
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
         return "Supervisor" + rmu + ", salary=" + salary + ", bonusPercentage=" + bonusPercentage + ", bonus=" + bonus + '}';
    }
}
