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
public class Sign {
    private Long id;
    
    private Long coacherId;
    
    private Long customerId;
    
    private Date ClassTime;
    
    private String feedback;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoacherId() {
        return coacherId;
    }

    public void setCoacherId(Long coacherId) {
        this.coacherId = coacherId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getClassTime() {
        return ClassTime;
    }

    public void setClassTime(Date ClassTime) {
        this.ClassTime = ClassTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
}
