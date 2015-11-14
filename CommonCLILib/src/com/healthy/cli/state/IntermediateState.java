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
public class IntermediateState extends AbstractState{

    public IntermediateState(IDoCommand commandItem) {
        super(commandItem);
    }

    @Override
    public void goToNext() {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void backToBefore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void handle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
