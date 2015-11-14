/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.interaction;

import com.healthy.cli.menu.MenuItemDef;
import com.healthy.cli.menu.MenuDefUtils;
import com.healthy.cli.command.CmdEnum;
import com.healthy.cli.command.IDoCommand;
import com.healthy.cli.command.MenuCommand;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author wewezhu
 */
public class CmdInteraction implements IInteraction {

    @Override
    public void executeCommand(IDoCommand command) {
        if (CmdEnum.MenuCommand.equals(command.getCommandType())) {
            MenuItemDef ci = command.getCommandDefinition();
            List<MenuItemDef> childrenCommandItems = MenuDefUtils.getChildrenCommandItem(ci);

            for (MenuItemDef item : childrenCommandItems) {

            }

            MenuItemDef chooseItem = null;

            while (chooseItem == null) {
                System.out.println("Choose your command:");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                String chooice = null;
                try {
                    chooice = br.readLine();
                    
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                chooseItem = MenuDefUtils.findCommandItemBySeqNum(Integer.parseInt(br.toString()));

                if (chooseItem == null) {
                    System.out.println("Choose Command not correct, please re-try the choice.");
                    System.out.println("Choose your command:");
                }else{
                    command.doCommand();
                    MenuCommand nextMenuCmd = new MenuCommand(chooseItem);
                    this.executeCommand(nextMenuCmd);
                }

            }

        } else if (CmdEnum.ExcCommand.equals(command.getCommandType())) {
                command.doCommand();
        } else {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }

}
