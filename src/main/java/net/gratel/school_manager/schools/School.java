/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.schools;

import net.gratel.school_manager.numbers.SchoolType;

/**
 *
 * @author 陈濯
 */
public class School {
    private SchoolType schooltype;
    private String schoolname;
    private President president;
    private TeacherList teacherlist;

    /**
     * @return the schooltype
     */
    public SchoolType getSchooltype() {
        return schooltype;
    }

    /**
     * @param schooltype the schooltype to set
     */
    public void setSchooltype(SchoolType schooltype) {
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

    @Override
    public String toString() {
        return "School{" + "schooltype=" + schooltype + ", schoolname=" + schoolname + ", president=" + president + ", teacherlist=" + teacherlist + '}';
    }

    
}
