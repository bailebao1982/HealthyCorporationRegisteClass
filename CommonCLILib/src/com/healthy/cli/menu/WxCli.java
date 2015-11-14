/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.menu;

import com.healthy.cli.command.IDoCommand;
import com.healthy.cli.command.MenuCommand;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author wewezhu
 */
public class WxCli {
    
    public WxCli(){
        init();
    }
    
    
     private void init() throws IOException, SAXException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder builder = dbf.newDocumentBuilder();
            InputStream in = CommandDef.class.getClassLoader().getResourceAsStream("test.xml");
            
            Document doc = builder.parse(in);
            
            Element root = doc.getDocumentElement();  
            
            if (root == null) return;  
               
            NodeList commandNodes = root.getChildNodes();
            if (commandNodes == null) return;
            for(int i = 0; i < commandNodes.getLength(); i++) {
                Node command = commandNodes.item(i);
           
              
                
                if (command != null && command.getNodeType() == Node.ELEMENT_NODE) {  
                    Element commandElement = (Element)command;
                    
                    String commandName = commandElement.getAttribute("name");
                    CommandDef commandInst = new CommandDef (commandName);
                    NodeList commandItemNodes = command.getChildNodes();
                    if (commandItemNodes == null) continue; 
                    
                    for (int j = 0; j < commandItemNodes.getLength(); j++) {
                        Node commandItem = commandItemNodes.item(j);
                        
                        if(commandItem!=null){
                            MenuItemDef commandItemInst = new MenuItemDef();
                            NodeList commandItemProps = commandItem.getChildNodes();
                            
                            for(int k = 0; k<commandItemProps.getLength(); k++){
                                Node commandItemProp = commandItemProps.item(k);
                                
                                if(commandItemProp.getNodeName().equals("id")){
                                    commandItemInst.setItemSeq(Integer.parseInt(commandItemProp.getNodeValue()));
                                }
                                if(commandItemProp.getNodeName().equals("Name")){
                                    commandItemInst.setCommandItemString(commandItemProp.getNodeValue());
                                }
                                if(commandItemProp.getNodeName().equals("Sequence")){
                                    commandItemInst.setItemSeq(Integer.parseInt(commandItemProp.getNodeValue()));
                                }
                                if(commandItemProp.getNodeName().equals("ParentCommandItem")){
                                    MenuItemDef parentCmdItem = commandInst.getCommandItemByItemSeq(Integer.parseInt(commandItemProp.getNodeValue()));
                                    commandItemInst.setParentCommandItem(parentCmdItem);
                                }
                                
                            }
                            commandInst.addCommandItem(commandItemInst);
                        }
                        
                        
                        
                    }  
                    
                    
                }
            }
            
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(CommandDef.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public CommandDef loadCommand(String commandName){
        
        return null;
    }
    
    
    public static void main(String[] args){
        WxCli wxCli = new WxCli();
        
        CommandDef command = wxCli.loadCommand("Weixin");
        IDoCommand menuCmd = new MenuCommand(CommandDef.getTopCommandItem());
        
        menuCmd.doCommand();
        
    }
}
