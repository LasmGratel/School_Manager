/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.numbers;

import net.gratel.school_manager.api.SchoolTypeAPI;

/**
 *
 * @author 陈濯
 */

public enum SchoolType  {
    OTHERTYPE_SCHOOL(0xffff,""),
    NORMAL_SCHOOL(1,"");
    private int TypeID;
    private String TypeName;

    /**
     * There code is in develop.
     */
    
    
    public int getTypeID() {
        return TypeID;
    }

    /**
     * @param TypeID the TypeID to set
     */
    public void setTypeID(int TypeID) {
        this.TypeID = TypeID;
    }

    /**
     * @return the TypeName
     */
    public String getTypeName() {
        return TypeName;
    }

    /**
     * @param TypeName the TypeName to set
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    SchoolType(int TypeID, String TypeName) {
        
        
    }
    
}
