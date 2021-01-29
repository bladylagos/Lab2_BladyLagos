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
public class Lab2_BladyLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList lista = new ArrayList();
        ArrayList<Integer> lista2 = new ArrayList();
        ArrayList lista3 = new ArrayList();

        int opcion = 0;
//        String correo = JOptionPane.showInputDialog("Ingrese Su Nombre Nombre: ");
//        String contra = JOptionPane.showInputDialog("Ingrese Su Contraseña: ");
        String correo = "david";
        String contra = "99";

        if (correo.contains("david") && contra.contains("99")) {

            while (opcion != 3) {

                opcion = Integer.parseInt(JOptionPane.showInputDialog("                     |Menu|      \n"
                                                   + "  1. Reporte de restaurantes\n" + "  2. Manejo de restaurantes\n"
                                                   + "  3. Salir"));

                switch (opcion) {
                    case 1: {
                        //Reporte
                        String salida = "";
                        for (Object o : lista) {
                            salida += lista.indexOf(o) + "-" + o + "\n";
                            JOptionPane.showMessageDialog(null, salida);
                        }
                        System.out.println("\n");
                    }
                    break;
                    case 2: {

                        String opcion2 = JOptionPane.showInputDialog("              |Menu|      \n"
                                                           + "   1. Crear\n"
                                                           + "   2. Listar\n"
                                                           + "   3. Modificar\n"
                                                           + "   4. Eliminar\n"
                                                           + "   5. Salir!!!");

                        if (opcion2.contains("1")) {
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

                            if (estado.contains("f") || estado.contains("F")) {

                            }
                        }
                        //Listar
                        if (opcion2.contains("2")) {

                            String mostrar = JOptionPane.showInputDialog("Desea Mostrar Su Restaurante [S/N]: ");
                            if (mostrar.contains("s") || mostrar.contains("S")) {
                                System.out.print("Mostrar: " + lista);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error");
                            }

                        }
                        System.out.println("\n");
                        //Modificar
                        if (opcion2.contains("3")) {
                            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que Cosa Del Restaurante Desea Cambiar\n"
                                                               + "Tenemos De 0 A 10 Opciones, Recordar Que Empleados, Mesas Y Cajeros Son Int"));

                            String cambio = JOptionPane.showInputDialog("Por Que Cosa Desea Cambiarlo: ");

                            lista.set(posicion, cambio);

                        }
                        //Eliminar
                        if (opcion2.contains("4")) {
                            lista.clear();
                        }
//                        manejo g = new manejo(opcion2);
//                        g.hacerOperaciones();
                    }
                    break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo.......");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo Tenemos 3 Opciones");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Login Incorrecto, Verifique Su Nombre O Su Contraseña");
        }
    }

}
/*
//                        String franquicia = JOptionPane.showInputDialog("Ingrese el nombre de la franquicia: ");
//                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del restaurante: ");
//                        String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion del restaurante: ");
//                        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));
//                        String parqueo = JOptionPane.showInputDialog("Ingrese S/N si tiene parqueo?: ");
//                        if (parqueo.contains("s") || parqueo.contains("S")) {
//                            lista.add(parqueo);
//                            System.out.println("Si hay parqueo");
//                        } else {
//                            System.out.println("No hay juegos");
//                        }
//                        String juegos = JOptionPane.showInputDialog("Ingrese S/N si tiene Area de juegos?: ");
//                        if (juegos.contains("s") || juegos.contains("S")) {
//                            lista.add(juegos);
//                            System.out.println("Si hay juegos");
//                        } else {
//                            System.out.println("No hay juegos");
//                        }
//                        int mesas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de mesas: "));
//                        int cajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajeros: "));
//                        String gerente = JOptionPane.showInputDialog("Ingrese el nombre del gerente: ");
//                        String especial = JOptionPane.showInputDialog("Ingrese la especialidad del restaurante ");
//                        String estado = JOptionPane.showInputDialog("Ingrese el estado del restaurante [Remodelacion = R, Demolición =D, Funcional =F]: ");
//
//                        lista.add(franquicia);
//                        lista.add(nombre);
//                        lista.add(ubicacion);
//                        lista.add(empleados);//int
////                      lista.add(parqueo);
////                      lista.add(juegos);
//                        lista.add(mesas);//int
//                        lista.add(cajeros);//int
//                        lista.add(gerente);
//                        lista.add(especial);
//                        lista.add(estado);
//
//                        System.out.println(lista);
 */
