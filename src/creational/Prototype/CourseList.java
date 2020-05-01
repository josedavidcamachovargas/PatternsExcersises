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
 * @author Andres Gonzalez
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
        return "CourseList: " + "courseList: " + courseList;
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
