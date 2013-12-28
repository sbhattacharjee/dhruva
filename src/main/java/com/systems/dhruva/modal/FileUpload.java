package com.systems.dhruva.modal;


import javax.persistence.Transient;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.web.multipart.MultipartFile;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class FileUpload {

    private String fileName;

	private long fileSize;

    private String contentType;

    @Transient
    private MultipartFile content;
}
