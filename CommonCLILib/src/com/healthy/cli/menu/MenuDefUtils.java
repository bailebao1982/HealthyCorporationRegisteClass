/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wewezhu
 */
public class MenuDefUtils {
    
    public static List<MenuItemDef> getChildrenCommandItem(MenuItemDef currentCommand){
        List<MenuItemDef> allItems = currentCommand.getCommand().getCommandItems();
        List<MenuItemDef> childrenItems = new ArrayList<MenuItemDef>();
        
        for(MenuItemDef item:allItems){
            if(item.getParentCommandItem().getItemSeq()==currentCommand.getItemSeq())
                childrenItems.add(item);
        }
        
        return childrenItems;
    }
    
    public static MenuItemDef findCommandItemBySeqNum(int sequenceNum){
        
        return null;
    }
    
    
}
