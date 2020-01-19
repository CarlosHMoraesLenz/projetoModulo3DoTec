/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAnimal;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 181820070
 */
public class NewMain {
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Calendar cal=Calendar.getInstance();
        Animal a=new Animal();
        a.setAnoAtual(cal.get(cal.YEAR));
        System.out.println(a.getAnoAtual());
        System.out.print("Digite o ano de nasc: ");
        a.setAnoNascimento(s.nextInt());
       
        System.out.println(a.idade());
    
    }
    
}
