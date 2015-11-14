/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.command;

import com.healthy.cli.menu.MenuItemCarriage;
import com.healthy.cli.menu.MenuItemDef;
import com.healthy.cli.menu.MenuDefUtils;
import com.healthy.cli.state.State;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author wewezhu
 */
public abstract class AbstractCommand implements IDoCommand{
    
    private MenuItemDef commandItem;
    
    private StateEnum state;
    
    Queue<MenuItemCarriage> carriages = new LinkedList<MenuItemCarriage>();
    
    public AbstractCommand(MenuItemDef commandItem){
        this.commandItem = commandItem;
        if(this.commandItem.getParentCommandItem() == null){
            this.state = StateEnum.starter;
        }else if(MenuDefUtils.getChildrenCommandItem(this.commandItem).size()>0){
            this.state = StateEnum.intermediate;
        }else{
            this.state = StateEnum.finalState;
        }
    }

    public Queue<MenuItemCarriage> getCarriages() {
        return carriages;
    }

    public MenuItemDef getCommandItem() {
        return commandItem;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }
    
    protected void stateTransfer(){
        
    }
    
     @Override
    public Object doCommand() {
        this.getCarriages().offer(this.getCommandItem().getCommandCarriage());
        
        return dowork();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object rollback() {
        this.getCarriages().poll();
        
        return undo();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected abstract Object dowork();
    
    protected abstract Object undo();
    
    public CmdEnum getCommandType(){
       
       return CmdEnum.MenuCommand;
   }
    
    public MenuItemDef getCommandDefinition(){
        return commandItem;
    }
}
