/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.api;

/**
 *
 * @author 陈濯
 */
public interface SchoolTypeAPI {
    

    /**
     * @return the TypeID
     */
    public int getTypeID();
    

    /**
     * @param TypeID the TypeID to set
     */
    public void setTypeID(int TypeID);

    /**
     * @return the TypeName
     */
    public String getTypeName();

    /**
     * @param TypeName the TypeName to set
     */
    public void setTypeName(String TypeName);

    
}
