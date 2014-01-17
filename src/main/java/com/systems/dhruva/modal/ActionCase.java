package com.systems.dhruva.modal;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ActionCase {

    private String defectTool;

    private String reportedBy;

    private String assignedTo;

    private String browser;

//    private ActionStep[] actionStep;

}
