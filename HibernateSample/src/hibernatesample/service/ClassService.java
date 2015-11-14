/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample.service;

import hibernatesample.dao.CoacherDAO;
import hibernatesample.dao.CustomerDAO;
import hibernatesample.dao.SignDAO;
import hibernatesample.dao.TrainingClassDAO;
import hibernatesample.entity.Coacher;
import hibernatesample.entity.Customer;
import hibernatesample.entity.TrainingClass;
import java.sql.Date;

/**
 *
 * @author wewezhu
 */
public class ClassService {
    
    private CoacherDAO coachDAO;
    
    private CustomerDAO customerDAO;
    
    private SignDAO signDAO;
    
    private TrainingClassDAO trainingClassDAO;
    
    /**
     * 增加一个会员信息
     * 
     * @param coacherId
     * @param customerId
     * @return 
     */
    public boolean newCustomer(Long coacherId,Long customerId){
        Coacher coacher = coachDAO.findCoaherById(coacherId);
        Customer customer = customerDAO.findCustomerById(customerId);
        
        customer.setCoacherId(coacherId);
        
        return true;
    }
    
    /**
     * 发起一个约课信息信息
     * @param coacherId
     * @param customerId
     * @param time
     * @return 
     */
    public boolean newAppointment(Long coacherId,Long customerId,Date time){
        TrainingClass trainingClass = new TrainingClass();
        trainingClass.setClassTime(time);
        trainingClass.setCoacher_ID(coacherId);
        trainingClass.setCustomer_ID(customerId);
        
        trainingClassDAO.addTrainingClass(trainingClass);
        
        MessageService messageService = new MessageService();
        
        String resMsg = "xxxxx";
        messageService.sendMessage(resMsg, customerId);
        
        return true;
    }
    
    /**
     * 接受约课信息
     * @param coacherId
     * @param customerId
     * @param time
     * @return 
     */
    public boolean acceptAppointment(Long coacherId, Long customerId,Date time){
        TrainingClass trainingClass = new TrainingClass();
        trainingClass.setClassTime(time);
        trainingClass.setCoacher_ID(coacherId);
        trainingClass.setCustomer_ID(customerId);
        
        trainingClassDAO.addTrainingClass(trainingClass);
        
        MessageService messageService = new MessageService();
        
        String resMsg = "xxxxx";
        messageService.sendMessage(resMsg, customerId);
        
        return true;
    }
    
    /**
     * 拒绝约课信息，提供拒绝理由
     * @param coacherId
     * @param customerId
     * @param time
     * @param reason
     * @return 
     */
    public boolean denyAppointment(Long coacherId, Long customerId, Date time,String reason){
        MessageService messageService = new MessageService();
        String resMsg = "xxxxx";
        messageService.sendMessage(resMsg, customerId);
        
        return true;
    }
    
    /**
     * 重排约课时间
     * @param apponitmentId
     * @param newTime
     * @return 
     */
    public boolean resheduleAppointment(Long apponitmentId, Date newTime){
        //TrainingClass trainingClass = trainingClassDAO.findTrainingClassByCoacher(apponitmentId);
        
        
        return false;
    }
    
    /**
     * 教练取消预约课程
     * @param coacherId
     * @param appointmentId
     * @return 
     */
    public boolean cancelAppointmentFromCoacher(Long coacherId,Long appointmentId){
        
        return false;
    }
    
    /**
     * 会员取消预约课程
     * @param customerId
     * @param appointmentId
     * @return 
     */
    public boolean cancelAppointmentFromCustomer(Long customerId,Long appointmentId){
        return false;
    }
    
    /**
     * 会员签课
     * @param customerId
     * @param coacherId
     * @param appointmentId
     * @return 
     */
    public boolean checkinClass(Long customerId, Long coacherId, Long appointmentId){
        return false;
    }
    
}
