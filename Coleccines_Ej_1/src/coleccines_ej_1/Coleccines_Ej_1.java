/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
 */
package coleccines_ej_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Coleccines_Ej_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razaPerros = new ArrayList<>();
        String raza;
        String rta;
        String razaElim;

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

        System.out.println(" TOTAL PERROS  : " + razaPerros.size());

        System.out.println(" INGRESE LA RAZA Q NO DEBE ESTAR EN LA LISTA : ");
        razaElim = leer.next();
        Iterator<String> mi_iterador = razaPerros.iterator();

        while (mi_iterador.hasNext()) {
            String it = mi_iterador.next();
            if (it.equals(razaElim)) {
                mi_iterador.remove();
                System.out.println(razaPerros);

        }

    }

    }
}

