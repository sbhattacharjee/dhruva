// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.systems.dhruva.modal;

import com.systems.dhruva.modal.ActionStep;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ActionStep_Roo_Jpa_Entity {
    
    declare @type: ActionStep: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ActionStep.id;
    
    @Version
    @Column(name = "version")
    private Integer ActionStep.version;
    
    public Long ActionStep.getId() {
        return this.id;
    }
    
    public void ActionStep.setId(Long id) {
        this.id = id;
    }
    
    public Integer ActionStep.getVersion() {
        return this.version;
    }
    
    public void ActionStep.setVersion(Integer version) {
        this.version = version;
    }
    
}
