package com.systems.dhruva.service;

import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Service;

@Service
public interface WebPageFacade {

	public boolean isAtDesiredPage(WebDriver drv, URI siteURL) throws IllegalStateException;

	public boolean execute() throws Exception;
}
