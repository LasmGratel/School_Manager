/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.language;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import net.gratel.school_manager.exception.PropertiesException;

/**
 *
 * @author 陈濯
 */
public class FrameLang implements net.gratel.school_manager.api.LanguageAPI{
    private Properties p;
    public FrameLang(){
        p=new UseLang().getProperties();
    }
    @Override
    public void setProperties(Properties p) {
        this.p=p;
    }

    @Override
    public Properties getProperties() {
        return p;
    }
    public String toString(int value){
        List<String> list=new ArrayList<>();
        
        list.add(p.getProperty("title"));
        list.add(p.getProperty("file"));
        list.add(p.getProperty("read"));
        list.add(p.getProperty("write"));
        list.add(p.getProperty("clear"));
        list.add(p.getProperty("exit"));
        list.add(p.getProperty("create"));
        list.add(p.getProperty("modifyPresident"));
        list.add(p.getProperty("seePresident"));
        list.add(p.getProperty("addStudents"));
        list.add(p.getProperty("addStudent"));
        list.add(p.getProperty("delStudent"));
        list.add(p.getProperty("addTeachers"));
        list.add(p.getProperty("addTeacher"));
        list.add(p.getProperty("delTeacher"));
        list.add(p.getProperty("name"));
        list.add(p.getProperty("age"));
        list.add(p.getProperty("birthday"));
        list.add(p.getProperty("teachername"));
        return "";
    }
    
}
