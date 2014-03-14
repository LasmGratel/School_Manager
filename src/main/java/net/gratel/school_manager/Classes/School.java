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
public class School {
    private int schooltype;
    private String schoolname;
    private President president;
    private TeacherList teacherlist;

    /**
     * @return the schooltype
     */
    public int getSchooltype() {
        return schooltype;
    }

    /**
     * @param schooltype the schooltype to set
     */
    public void setSchooltype(int schooltype) {
        this.schooltype = schooltype;
    }

    /**
     * @return the schoolname
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * @param schoolname the schoolname to set
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    /**
     * @return the president
     */
    public President getPresident() {
        return president;
    }

    /**
     * @param president the president to set
     */
    public void setPresident(President president) {
        this.president = president;
    }

    /**
     * @return the teacherlist
     */
    public TeacherList getTeacherlist() {
        return teacherlist;
    }

    /**
     * @param teacherlist the teacherlist to set
     */
    public void setTeacherlist(TeacherList teacherlist) {
        this.teacherlist = teacherlist;
    }
    
}
