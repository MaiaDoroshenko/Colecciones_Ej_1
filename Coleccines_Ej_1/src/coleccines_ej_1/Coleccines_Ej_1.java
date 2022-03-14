/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package coleccines_ej_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccines_Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razaPerros = new ArrayList<>();
        String raza;
        String rta;

        do {
            System.out.println(" Ingrese raza de Perro : ");
            raza = leer.next();
            razaPerros.add(raza);
            System.out.println(" Agregar otra perro , si/no ");
            rta = leer.next();

        } while ("si".equalsIgnoreCase(rta));
        
         System.out.println(" RAZAS ");
         System.out.println("");
        
        for (String lista : razaPerros) {
           
            System.out.println(lista);
        }
        
        System.out.println( " TOTAL PERROS  : "+ razaPerros.size());
       
       
    }

}
