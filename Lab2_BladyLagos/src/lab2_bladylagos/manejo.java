/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_bladylagos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo Lagos
 */
public class manejo {

    ArrayList lista = new ArrayList();
    ArrayList<Integer> lista2 = new ArrayList();
    ArrayList lista3 = new ArrayList();

    private String operac;

    public manejo(String control) {
        this.operac = control;
    }

    public void hacerOperaciones() {
        //operac
        if (operac.contains("1")) {
            String franquicia = JOptionPane.showInputDialog("Ingrese el nombre de la franquicia: ");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del restaurante: ");
            String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion del restaurante: ");
            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));
            String parqueo = JOptionPane.showInputDialog("Ingrese S/N si tiene parqueo?: ");
            if (parqueo.contains("s") || parqueo.contains("S")) {
                lista.add(parqueo);
                System.out.println("Si hay parqueo");
            } else {
                System.out.println("No hay juegos");
            }
            String juegos = JOptionPane.showInputDialog("Ingrese S/N si tiene Area de juegos?: ");
            if (juegos.contains("s") || juegos.contains("S")) {
                lista.add(juegos);
                System.out.println("Si hay juegos");
            } else {
                System.out.println("No hay juegos");
            }
            int mesas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de mesas: "));
            int cajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajeros: "));
            String gerente = JOptionPane.showInputDialog("Ingrese el nombre del gerente: ");
            String especial = JOptionPane.showInputDialog("Ingrese la especialidad del restaurante ");
            String estado = JOptionPane.showInputDialog("Ingrese el estado del restaurante [Remodelacion = R, Demolición =D, Funcional =F]: ");

            lista.add(franquicia);
            lista.add(nombre);
            lista.add(ubicacion);
            lista.add(empleados);//int
            lista.add(mesas);//int
            lista.add(cajeros);//int
            lista.add(gerente);
            lista.add(especial);
            lista.add(estado);

//            if (estado.contains("f") || estado.contains("F")) {
//
//            }
        }
        //Listar
        if (operac.contains("2")) {

            String mostrar = JOptionPane.showInputDialog("Desea Mostrar Su Restaurante [S/N]: ");
            if (mostrar.contains("s") || mostrar.contains("S")) {
                System.out.print("Mostrar: " + lista);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }
        System.out.println("\n");
        //Modificar
        if (operac.contains("3")) {
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que Cosa Del Restaurante Desea Cambiar\n"
                                               + "Tenemos De 0 A 10 Opciones, Recordar Que Empleados, Mesas Y Cajeros Son Int"));

            String cambio = JOptionPane.showInputDialog("Por Que Cosa Desea Cambiarlo: ");

            lista.set(posicion, cambio);

        }
        //Eliminar
        if (operac.contains("4")) {
            lista.clear();
        }
    }
}
