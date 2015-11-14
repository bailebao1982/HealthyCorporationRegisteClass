/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author wewezhu
 */
public class CommandDef {
    private List<MenuItemDef> commandItems;
    
    private Map<Integer,MenuItemDef> commandItemsMap = new HashMap<Integer,MenuItemDef>();
    
    private HashMap<MenuItemDef,Menu> MenuCliMap = new HashMap<MenuItemDef, Menu>();
    
    private int getCurrentStep;

    private String commandName ;
    
    private static MenuItemDef topPresudoCommandItem;
    
    private Menu blankMenu;
    
    private Menu getBlankMenu(){
        if(this.blankMenu == null){
            Menu menu = new Menu();
            menu.setMenuName("BlankMenu");
            
            this.blankMenu = menu;
            return this.blankMenu;
        }else{
            return this.blankMenu;
        }
    }
    
    private List<Menu> menus = new ArrayList<Menu>();
   
    public void addMenu(Menu menu){
        this.menus.add(menu);
    }

    public List<Menu> getMenus() {
    
        
        return menus;
    }
    
    public Menu getMenuByName(String menuName){
            for(Menu menu:menus){
            if(menuName.equals(menu.getMenuName())){
                return menu;
            }
            }
            return this.getBlankMenu();
    }
    
     public static MenuItemDef getTopCommandItem(){
        
        if(topPresudoCommandItem!=null){
            return topPresudoCommandItem;
        }else{
        
         topPresudoCommandItem = new MenuItemDef();
         //topPresudoCommandItem.setCommand(this);
         topPresudoCommandItem.setItemSeq(0);
         return topPresudoCommandItem;
        }
    }
     
    public CommandDef(String name){
        this.commandName = name;
    }
    
    public List<MenuItemDef> getCommandItems() {
        return commandItems;
    }

    public void setCommandItems(List<MenuItemDef> commandItems) {
        this.commandItems = commandItems;
    }
    
    public MenuItemDef getNextCommandItem(){
        
        
        return null;
    }
    
    public void addCommandItem(MenuItemDef commandItem){
        commandItemsMap.put(commandItem.getItemSeq(), commandItem);
    }
    
    public MenuItemDef getCommandItemByItemSeq(int seq){
        return commandItemsMap.get(seq);
    }
    
   

    public HashMap<MenuItemDef, Menu> getMenuCliMap() {
        return MenuCliMap;
    }

    public void setMenuCliMap(HashMap<MenuItemDef, Menu> MenuCliMap) {
        this.MenuCliMap = MenuCliMap;
    }
    
    
    public void buildMenuCli(MenuItemDef ci){
       
        if(MenuDefUtils.getChildrenCommandItem(ci).size()>0){
            for(MenuItemDef sci :MenuDefUtils.getChildrenCommandItem(ci)){
                buildMenuCli(sci);
            }
        }else{
            if(MenuCliMap.containsKey(ci.getParentCommandItem())){
                Menu menu = MenuCliMap.get(ci.getParentCommandItem());
                menu.addCommandItem(ci);
                MenuCliMap.put(ci.getParentCommandItem(), menu);
            }else{
                Menu menu = new Menu();
                menu.addCommandItem(ci);
                MenuCliMap.put(ci.getParentCommandItem(), menu);
            }
        }
        
        
        
        
        
        
    }
}
