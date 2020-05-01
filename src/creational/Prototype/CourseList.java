/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crearuna lista de cursos, también implementa de la 
 * clase PrototypeInterface la cual tiene el metodo clone() que se va a modificar 
 * en esta clase.
 */

public class CourseList implements PrototypeInterface{

   private Course[] courseList;

    public CourseList() {
    }

    public CourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        String aux = "";
        for(int i = 0; i < courseList.length; i++){
            aux += courseList[i].toString() + "\n";
        }
        return "Lista de cursos: " + aux;
    }

   @Override
   public Object clone(){
       try {
           return super.clone();
       } catch (CloneNotSupportedException ex) {
           Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
}
