package com.taxdocs.webservice.controller;

import com.taxdocs.webservice.filters.AllowedAccess;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaxDocumentsResource {

    @RequestMapping(value = "/1099/{tin}", method = RequestMethod.GET)
    @AllowedAccess(property = "$tax-docs.webservice-{allowed.access.get}")
    public Object get1099Docs(@PathVariable String tin){
        return new Object();
    }

    @RequestMapping(value = "/w2/{tin}", method = RequestMethod.GET)
    @AllowedAccess(property = "$tax-docs.webservice-{allowed.access.get}")
    public Object getW2Docs(@PathVariable String tin){
        return new Object();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @AllowedAccess(property = "$tax-docs.webservice-{allowed.access.post}")
    public void addDoc(@RequestBody Object doc){
        System.out.println("New Doc Uploaded");
    }

}
