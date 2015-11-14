/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.dao;

import com.wx.entity.SalesRecord;

/**
 *
 * @author wewezhu
 */
public interface SalesRecordDAO {
    SalesRecord findSalesRecordByCustomer(String customer);
}
