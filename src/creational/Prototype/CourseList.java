/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Prototype;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * 
 * Esta clase se encarga de crear una lista de cursos, usando un ArrayList con
 * objetos de la clase Course.
 * 
 * Esta clase facilita la creación de objetos
 * que pueden crear duplicados de sí mismos.
 */

public class CourseList implements Cloneable {

    private ArrayList<Course> courseList;

    public CourseList() {
        courseList = new ArrayList<>();
    }

    public CourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < courseList.size(); i++) {
            aux += courseList.get(i).toString() + "\n";
        }
        return "Lista de cursos:\n" + aux;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CourseList clone = new CourseList();
        for (Course course : courseList) {
            clone.getCourseList().add((Course)course.clone());
        }
        return clone;
    }
}
