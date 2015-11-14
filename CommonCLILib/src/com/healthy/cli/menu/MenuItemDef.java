/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.menu;

/**
 *
 * @author wewezhu
 */
public class MenuItemDef {
    
    private int itemSeq;
    
    private String commandItemString;
    
    private String commandItemValue;
    
    private MenuItemDef parentCommandItem;
    
    private CommandDef command;
    
    private MenuItemCarriage commandCarriage;
    
    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    public MenuItemCarriage getCommandCarriage() {
        return commandCarriage;
    }

    public void setCommandCarriage(MenuItemCarriage commandCarriage) {
        this.commandCarriage = commandCarriage;
    }

    public int getItemSeq() {
        return itemSeq;
    }

    public void setItemSeq(int itemSeq) {
        this.itemSeq = itemSeq;
    }

    public String getCommandItemString() {
        return commandItemString;
    }

    public void setCommandItemString(String commandItemString) {
        this.commandItemString = commandItemString;
    }

    public String getCommandItemValue() {
        return commandItemValue;
    }

    public void setCommandItemValue(String commandItemValue) {
        this.commandItemValue = commandItemValue;
    }

    public MenuItemDef getParentCommandItem() {
        return parentCommandItem;
    }

    public void setParentCommandItem(MenuItemDef parentCommandItem) {
        this.parentCommandItem = parentCommandItem;
    }

    public CommandDef getCommand() {
        return command;
    }

    public void setCommand(CommandDef command) {
        this.command = command;
    }
    
    
    
}
