/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample.entity;

import java.sql.Date;

/**
 *
 * @author wewezhu
 */
public class TrainingClass {
    private Long id;
    
    private Long Coacher_ID;
    
    private Long Customer_ID;
    
    private Date classTime;
    
    private String trainingPlan;
    
    private boolean schedule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoacher_ID() {
        return Coacher_ID;
    }

    public void setCoacher_ID(Long Coacher_ID) {
        this.Coacher_ID = Coacher_ID;
    }

    public Long getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(Long Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public Date getClassTime() {
        return classTime;
    }

    public void setClassTime(Date classTime) {
        this.classTime = classTime;
    }

    public String getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(String trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public boolean isSchedule() {
        return schedule;
    }

    public void setSchedule(boolean schedule) {
        this.schedule = schedule;
    }
    
    
}
