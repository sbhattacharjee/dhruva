// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.systems.dhruva.modal;

import com.systems.dhruva.modal.ActionCase;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ActionCase_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager ActionCase.entityManager;
    
    public static final EntityManager ActionCase.entityManager() {
        EntityManager em = new ActionCase().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ActionCase.countActionCases() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ActionCase o", Long.class).getSingleResult();
    }
    
    public static List<ActionCase> ActionCase.findAllActionCases() {
        return entityManager().createQuery("SELECT o FROM ActionCase o", ActionCase.class).getResultList();
    }
    
    public static ActionCase ActionCase.findActionCase(Long id) {
        if (id == null) return null;
        return entityManager().find(ActionCase.class, id);
    }
    
    public static List<ActionCase> ActionCase.findActionCaseEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ActionCase o", ActionCase.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void ActionCase.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ActionCase.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ActionCase attached = ActionCase.findActionCase(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ActionCase.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ActionCase.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public ActionCase ActionCase.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ActionCase merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}