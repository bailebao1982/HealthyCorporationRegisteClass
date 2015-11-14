/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.command;

import com.healthy.cli.menu.MenuItemDef;

/**
 *
 * @author wewezhu
 */
public interface IDoCommand {
    
    public Object doCommand();
    
    public Object rollback();
    
    public CmdEnum getCommandType();
    
    public MenuItemDef getCommandDefinition();
    
  
}
