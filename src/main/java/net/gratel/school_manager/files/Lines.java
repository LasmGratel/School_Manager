/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.files;

import java.util.ArrayList;
import java.util.List;
import net.gratel.school_manager.App;
import net.gratel.school_manager.numbers.SchoolType;
import net.gratel.school_manager.schools.*;

/**
 *
 * @author 陈濯
 */
public class Lines {
    public static List<String> getList(){
        List<String> l=new ArrayList<>();
        School s=new App().getSchool();
        President p=s.getPresident();
        TeacherList ts=s.getTeacherlist();
        SchoolType ty=s.getSchooltype();
        
        l.add("School:");
        l.add(spc(4)+"name:"+s.getSchoolname());
        l.add(spc(4)+"president:");
        l.add(spc(8)+"name:"+p.getName());
        l.add(spc(8)+"age:"+p.getAge());
        l.add(spc(4)+"TeacherList:");
        
        for(int i=0;i<=ts.getTeacherLength();i++){
            Teacher te=ts.getTeachers(i);
            l.add(spc(8)+"Teacher #"+i+':');
            l.add(spc(12)+"name:"+te.getName());
            l.add(spc(12)+"age:"+te.getAge());
            l.add(spc(12)+"students:");
            
            for(int j=0;j<=te.getStudents().getStudentLength();j++){
                Student st=te.getStudents().getStudents(j);
                l.add(spc(12)+"Student #"+j);
                l.add(spc(16)+"name:"+st.getName());
                l.add(spc(16)+"age:"+st.getAge());
                l.add(spc(16)+"birthday:"+st.getBirthday());
            }
        }
        return l;
    }
    private String spc(long t,boolean isTab){
        StringBuilder sb=new StringBuilder();
        if(isTab){
            for(long i=0l;i<=t*4;i++){
                sb.append(" ");
            }
        }else{
            for(long i=0l;i<=t;i++){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    private static String spc(long t){
        StringBuilder sb=new StringBuilder();
        
            for(long i=0l;i<=t;i++){
                sb.append(" ");
            }
           
        
        return sb.toString();
    }
}
