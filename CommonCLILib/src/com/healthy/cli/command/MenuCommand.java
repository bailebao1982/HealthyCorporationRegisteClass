/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.command;

import com.healthy.cli.menu.MenuItemCarriage;
import com.healthy.cli.menu.MenuItemDef;
import com.healthy.cli.menu.Menu;
import java.util.List;

/**
 *
 * @author wewezhu
 */
public class MenuCommand extends AbstractCommand{

    public MenuCommand(MenuItemDef commandItem) {
        super(commandItem);
    }

    @Override
    protected Object dowork() {
         StringBuffer cmdMessage = new StringBuffer();
        if(this.getState().equals(StateEnum.finalState)){
           
            while(this.getCarriages().peek()!=null){
               MenuItemCarriage carriage = this.getCarriages().poll();
               cmdMessage.append(String.valueOf(carriage.getValue()));
            }
        }else{
           Menu menu = this.getCommandItem().getCommand().getMenuCliMap().get(this.getCommandItem());
           menu.displayMenu();
           
        }
        
        return null;
    }

    @Override
    protected Object undo() {
        if(this.getState().equals(StateEnum.starter)){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        Menu menu = this.getCommandItem().getCommand().getMenuCliMap().get(this.getCommandItem().getParentCommandItem());
        menu.displayMenu();
        return null;
    }

   
    
}
