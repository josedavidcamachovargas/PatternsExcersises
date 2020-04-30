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
 * Esta clase se encarga de crear un profesor con sus respectivos
 * metodos set y get, constructor y toString
 */
public class Teacher {
    private String fullName;
    private int id;
    private String academicDegree;

    public Teacher(String fullName, int id, String academicDegree) {
        this.fullName = fullName;
        this.id = id;
        this.academicDegree = academicDegree;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher: " + ", fullName: " + fullName + ", id: " + id + ", academicDegree: " + academicDegree;
    }
}
