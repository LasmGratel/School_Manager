/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.schools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 陈濯
 */
public class Students {
    private int StudentLength;
    private List<Student> students=new ArrayList<>();

    /**
     * @return the StudentLength
     */
    public int getStudentLength() {
        return StudentLength;
    }

    /**
     * @param StudentLength the StudentLength to set
     */
    public void setStudentLength(int StudentLength) {
        this.StudentLength = StudentLength;
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    /**
     * @param index
     * @return the students
     */
    public Student getStudents(int index) {
        return students.get(index);
    }

    /**
     * @param student add student into students
     */
    public void setStudents(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Students{" + "StudentLength=" + StudentLength + ", students=" + students + '}';
    }

    
    
    
}
