// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.systems.dhruva.modal;

import com.systems.dhruva.modal.ActionCase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ActionCase_Roo_Jpa_Entity {
    
    declare @type: ActionCase: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ActionCase.id;
    
    @Version
    @Column(name = "version")
    private Integer ActionCase.version;
    
    public Long ActionCase.getId() {
        return this.id;
    }
    
    public void ActionCase.setId(Long id) {
        this.id = id;
    }
    
    public Integer ActionCase.getVersion() {
        return this.version;
    }
    
    public void ActionCase.setVersion(Integer version) {
        this.version = version;
    }
    
}