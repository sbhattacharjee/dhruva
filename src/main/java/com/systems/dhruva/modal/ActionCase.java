package com.systems.dhruva.modal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ActionCase {

    private String defectTool;

    private String reportedBy;

    private String assignedTo;

    private String browser;

    private String browserVersion;

    private URL siteURL;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<ActionStep> actionStepColl = new ArrayList<ActionStep>();
}
