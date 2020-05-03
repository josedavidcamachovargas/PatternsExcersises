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
    private String id;
    private String academicDegree;

    public Teacher(String fullName, String id, String academicDegree) {
        this.fullName = fullName;
        this.id = id;
        this.academicDegree = academicDegree;
    }

    public Teacher() {
    }
    

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return  "Nombre :"  + fullName + ", número de cédula: " + id + ", grado académico: " + academicDegree;
    }
}
