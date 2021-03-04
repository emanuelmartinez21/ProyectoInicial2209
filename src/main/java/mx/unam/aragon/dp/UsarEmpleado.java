/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author Fatima
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado empl=new Empleado(1, "Sistemas", 45000.0f, 15);
        empl.setNombre("Juan Jose");
        empl.setApPaterno("Garcia");
        empl.setApMaterno("Bolaños");
        empl.setEdad(24);
        empl.setCurp("GAB121212HDFTR2");
        
        System.out.println("info:" + empl );
    }    
}
