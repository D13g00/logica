import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class arreglo{
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        Scanner consola = new Scanner(System.in);

        alumnos.add("Álvarez Urrea Chelsea Jeraldyn");
        alumnos.add("Avila Ramirez Emmanuel");
        alumnos.add("Escareño Solorio Juan Mauricio");
        alumnos.add("Escobedo Guerra Victor Manuel");
        alumnos.add("González De Alba Francisco Javier");
        alumnos.add("Gonzalez Rossi Santiago");
        alumnos.add("Hernandez Aguilartrue Emiliano");
        alumnos.add("Lozano Aldana José Mariano");
        alumnos.add("Macias Hernandez Luis Leonardo");
        alumnos.add("Manrique Morales Fernanda Arely");
        alumnos.add("Marquez Esparza Saul Alejandro");
        alumnos.add("Meza Lozano Barbara");
        alumnos.add("Montoya Sandoval Viery Dassaeb");
        alumnos.add("Ornelas González Gael");
        alumnos.add("Pimentel Dolores Angel Salvador");
        alumnos.add("Piñon Garcia Axel Emmanuel");
        alumnos.add("Ramírez Zaldumbide Ignacio Xavier");
        alumnos.add("Rodríguez Arellano Cruz Ángel");
        alumnos.add("Rodríguez Santoyo Diego Tadeo");
        alumnos.add("Sánchez Álvarez Ingrid Regina");
        alumnos.add("Sierra Perez José Angel");
        alumnos.add("Torres Gonzalez Cesar Santiago");
        alumnos.add("Tovar Romero Jhostyn Alexander");
        alumnos.add("Trejo Hernández Jorge Alonso");
        alumnos.add("Vazquez Gomez Angel De Jesus");
        alumnos.add("Vilchis Perez Jose Miguel");
        alumnos.add("Viveros Tellez Kevin");

        ArrayList<Boolean> asistencia = new ArrayList<>(Collections.nCopies(alumnos.size(), false));

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("¿Asistió " + alumnos.get(i) + "? (true/false)");
            asistencia.set(i, Boolean.parseBoolean(consola.nextLine()));
        }
        System.out.println("Reporte de asistencia:");
        int asistencias = 0;
        int faltas = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (asistencia.get(i)) {
                asistencias++;
            } else {
                System.out.println("El canijillo detrue " + alumnos.get(i) + " no asistió a clase.");
                faltas++;
            }
        }
        System.out.println("Total de asistencias: " + asistencias);
        System.out.println("Total de faltas: " + faltas);
        System.out.println("Tremendo exitoso, ya denle el titulo " + alumnos.get(2));
        
    }
}     