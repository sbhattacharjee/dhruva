// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.systems.dhruva.modal;

import com.systems.dhruva.modal.FileUpload;
import org.springframework.web.multipart.MultipartFile;

privileged aspect FileUpload_Roo_JavaBean {
    
    public String FileUpload.getFileName() {
        return this.fileName;
    }
    
    public void FileUpload.setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public long FileUpload.getFileSize() {
        return this.fileSize;
    }
    
    public void FileUpload.setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
    
    public String FileUpload.getContentType() {
        return this.contentType;
    }
    
    public void FileUpload.setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    public MultipartFile FileUpload.getContent() {
        return this.content;
    }
    
    public void FileUpload.setContent(MultipartFile content) {
        this.content = content;
    }
    
}
