/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Prototype;

/**
 *
  * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crear uncurssoe con sus respectivos
 * metodos set y get, constructor y toString
 */
public class Course {
    private String name;
    private String acronym;
    private int credits;
    private Teacher teacher;
    private Student[] students;

    public Course(String name, String acronym, int credits, Teacher teacher, Student[] students) {
        this.name = name;
        this.acronym = acronym;
        this.credits = credits;
        this.teacher = teacher;
        this.students = students;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nSiglas: " + acronym + "\nCredits: " +
                credits + "\nTeacher: " + teacher + "\nStudents: " + students;
    }
}
