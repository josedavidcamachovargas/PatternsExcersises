/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Prototype;

/**
 *
 * @author Andres Gonzalez
 */
public class Test {

    public static void main(String args[]) {
        Teacher t1 = new Teacher("Dennis Gonzalez", 1234567, "Informatico");
        Teacher t2 = new Teacher("Alberto Ramirez", 7654321, "Informatico");
        
        Student s1 = new Student("Andres Gonzalez Orozco", 207700013, "B83477", 5);
        Student s2 = new Student("José David Camacho Vargas", 207650954, "B91484", 5);
        
        Student[] slist = new Student[2];
        slist[0] = s1;
        slist[1] = s2;
        
        Course c1 = new Course("PorgramaciónII", "IF3000", 4, t1 ,slist);
        Course c2 = new Course("Algoritmos y Estructuras de Datos", "IF3001", 4, t2 ,slist);
        
        Course[] clist = new Course[2];
        clist[0] = c1;
        clist[1] = c2;
        
        System.out.println("Profesor #1: " + t1);
        System.out.println("Profesor #2: " + t2 + "\n");
        
        System.out.println("Estudiante #1: " + s1);
        System.out.println("Estudiante #2: " + s2 + "\n");
        
        CourseList cl = new CourseList();
        cl.setCourseList(clist);
        System.out.println("Lista de cursos con datos agregados: \n" + cl.toString() + "\n");
        CourseList cclonada =  (CourseList) cl.clone();
        System.out.println("Lista de cursos clonada: " + cclonada);
    }
}
