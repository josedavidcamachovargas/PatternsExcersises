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
 * Esta clase se encarga de crear un estudiante con sus respectivos
 * metodos set y get, constructor y toString
 */
public class Student {
    private String fullName;
    private int id;
    private String studentId;
    private int schoolarship;

    public Student(String fullName, int id, String studentId, int schoolarship) {
        this.fullName = fullName;
        this.id = id;
        this.studentId = studentId;
        this.schoolarship = schoolarship;
    }

    public Student() {
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(int schoolarship) {
        this.schoolarship = schoolarship;
    }

    @Override
    public String toString() {
        return "Student: " + ", fullName: " + fullName + ", id: " + id + ", studentId: " + studentId + ", schoolarship: " + schoolarship;
    }
}
