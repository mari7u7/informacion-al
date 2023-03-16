/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.informacion_personal;

/**
 *
 * @author Maricruz
 */
public class Informacion_Personal {
          double promedio;
          int NumMaterias; 
          string ingles;
          string calculo;
          string Interaccion;
          string administracion;
          string Algoritmos;
            
    public void Materias (){
        interaccion = JOptionPane.showInputDialog("La calificacion de interaccion es:");
               ingles = JOptionPane.showInputDialog("La calificacion de ingles es:");
               programacion = JOptionPane.showInputDialog("La calificacion de programacion es:");
               pmc = JOptionPane.showInputDialog("La calificacion de pmc es:");
               requisitos = JOptionPane.showInputDialog("La calificacion de requisitos es:");
           }
           public void Promedio(){
               JOptionPane.showMessageDialog(null, "Materias que cursa actualmente:"
                + "interaccion: " + interaccion + "\ningles: " + ingles
                + "\nprogramacion: " + programacion + "\npmc: $" + pmc + "\nrequisitos: " + requisitos);
                JOptionPane.showMessageDialog(null, "El promedio del alumno es :"
                + "interaccion: " + interaccion + "\ningles: " + ingles
                + "\nprogramacion: " + programacion + "\npmc: $" + pmc + "\nrequisitos: " + requisitos+ mult + promedio*mult);
    }
            
    public static void main(String[] args) {
        Informacion_Personal prom=new Informacion_Personal();
             prom.Materias();
             prom.Promedio();
    }
}
