/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample.entity;

/**
 *
 * @author wewezhu
 */
public class Customer {
    private Long id;
    
    private String name;
    
    private String type;
    
    private Long coacherId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCoacherId() {
        return coacherId;
    }

    public void setCoacherId(Long coacherId) {
        this.coacherId = coacherId;
    }
    
    
}
