/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.schools;

/**
 *
 * @author 陈濯
 */
public class Teacher {
    private String name;
    private int age;
    private Students students;
    public Teacher(){
    }
    public Teacher(int age,String name,Students students){
        this.name=name;
        this.age=age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the students
     */
    public Students getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Students students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", age=" + age + '}';
    }
    
}
