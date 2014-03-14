/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.Classes;

/**
 *
 * @author 陈濯
 */
public class Student {
    private int age;
    private String birthday;
    private String name;
    private TeacherList teach;
    private School inSchool;

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
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
     * @return the teach
     */
    public TeacherList getTeach() {
        return teach;
    }

    /**
     * @param teach the teach to set
     */
    public void setTeach(TeacherList teach) {
        this.teach = teach;
    }

    /**
     * @return the inSchool
     */
    public School getInSchool() {
        return inSchool;
    }

    /**
     * @param inSchool the inSchool to set
     */
    public void setInSchool(School inSchool) {
        this.inSchool = inSchool;
    }
    
}
