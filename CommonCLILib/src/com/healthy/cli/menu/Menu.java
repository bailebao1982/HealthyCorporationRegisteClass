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
public class Menu {
    private List<MenuItemDef> commandItems = new ArrayList<MenuItemDef>();
    
    private MenuItemDef returnMenuItem;
    
    private String menuName;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    
    private MenuItemDef getReturnMenuItem(){
        
        if(returnMenuItem == null){
            MenuItemDef returnMenu = new MenuItemDef();
            returnMenu.setCommandItemString("Return to parent.");
            returnMenu.setMenu(this);
        
        }
        return returnMenuItem;
    }
    
    
    public Menu(){
        if(commandItems.contains(returnMenuItem) != true){
            this.addCommandItem(getReturnMenuItem());
        }
    }

    public List<MenuItemDef> getCommandItems() {
        return commandItems;
    }

    public void setCommandItems(List<MenuItemDef> commandItems) {
        this.commandItems = commandItems;
    }
    
    public void addCommandItem(MenuItemDef commandItem){
        this.commandItems.add(commandItem);
    }
    
    public void displayMenu(){
        List<MenuItemDef> commandItems = getCommandItems();
           for(MenuItemDef item:commandItems){
               System.out.println(item.getCommandItemString());
           }
    }
    
}
