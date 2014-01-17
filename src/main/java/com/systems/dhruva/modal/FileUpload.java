package com.systems.dhruva.modal;


import java.io.File;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class FileUpload {

    private String fileName;

	private long fileSize;

    private String contentType;

    private File fileUpload;
    
    private byte[] content;
}
