/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.healthy.cli.state;

/**
 *
 * @author wewezhu
 */
public interface State {
    void goToNext();
    
    void backToBefore();
    
    void handle();
}
