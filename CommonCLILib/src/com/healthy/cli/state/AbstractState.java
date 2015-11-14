/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.state;

import com.healthy.cli.command.IDoCommand;

/**
 *
 * @author wewezhu
 */
public abstract class AbstractState implements State{
    
    private IDoCommand command;
    
    public AbstractState(IDoCommand commandItem){
        this.command = commandItem;
    }

    public IDoCommand getCommandItem() {
        return command;
    }
    
    
}
