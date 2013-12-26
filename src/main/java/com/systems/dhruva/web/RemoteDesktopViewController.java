package com.systems.dhruva.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.systems.dhruva.modal.Client;

@RequestMapping("/remoteDesktopView/**")
@Controller
@RooJson
public class RemoteDesktopViewController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("*******************************************************************");
    }

    @RequestMapping
    public String index() {
        return "remoteDesktopView";
    }
}


