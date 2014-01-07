package com.systems.dhruva.modal;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ActionStep {

    private String command;

    private String selectorType;

    private String expectedResult;

    private String targetLocator;

    private String testResult;

    private String errorMessage;

    private String errorDetails;
}
