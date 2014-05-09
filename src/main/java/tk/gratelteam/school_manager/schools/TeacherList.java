/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.school_manager.schools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 陈濯
 */
public class TeacherList {
    private int TeacherLength;
    private List<Teacher> teachers=new ArrayList<>();

    /**
     * @return the TeacherLength
     */
    public int getTeacherLength() {
        return TeacherLength;
    }

    /**
     * @param TeacherLength the TeacherLength to set
     */
    public void setTeacherLength(int TeacherLength) {
        this.TeacherLength = TeacherLength;
    }

    /**
     * @return the teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @param teachers the teachers to set
     */
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    /**
     * @param index
     * @return the teachers
     */
    public Teacher getTeachers(int index) {
        return teachers.get(index);
    }

    /**
     * @param teacher add teacher into teachers
     */
    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
        ++TeacherLength;
    }

    @Override
    public String toString() {
        return "有" + TeacherLength +"个老师";
    }
    
}
