package com.systems.dhruva.modal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Client {

    @NotNull
    @Size(min = 2)
    private String clientName;

    private String streetAddress;

    @NotNull
    private Integer contactNumber;

    private String URL;
}
