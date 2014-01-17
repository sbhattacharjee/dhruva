package com.systems.dhruva.web;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.systems.dhruva.modal.FileUpload;
import com.systems.dhruva.service.TestSuiteFacade;

@RequestMapping("/fileuploads")
@Controller
@RooWebScaffold(path = "fileuploads", formBackingObject = FileUpload.class)
public class FileUploadController {

	private static final Logger log = Logger
			.getLogger(FileUploadController.class);

	@Autowired
	private TestSuiteFacade testSuiteFacade;

	
	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
	public String create(
			@Valid FileUpload fileUpload,
			BindingResult bindingResult, Model uiModel,
			@RequestParam("content") MultipartFile content,
			HttpServletRequest httpServletRequest) {

		log.debug("********************************** UPLOADING FILE TO SERVER *********************************************");

		File dest = new File( content.getOriginalFilename());
		try {
			content.transferTo(dest);
			fileUpload.setFileSize(content.getSize());
			fileUpload.setFileName(dest.getName());
			fileUpload.setContentType(content.getContentType());
			fileUpload.setFileUpload(dest);
			
			testSuiteFacade.buildTestSuite(fileUpload);

			log.debug("filename ==> "+fileUpload.getFileName());
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			return "fileuploads/create";
		}

		uiModel.asMap().clear();
		fileUpload.persist();

		log.debug("******************************************* *END OF UPLOAD **************************************************************");

		return "redirect:/fileuploads/"
				+ encodeUrlPathSegment(fileUpload.getId().toString(),
						httpServletRequest);

	}
}
