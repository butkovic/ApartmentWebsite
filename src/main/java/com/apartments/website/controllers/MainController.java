package com.apartments.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Petar Butkovic on 07/02/2016. controller
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndexView(){
        return "coming-soon";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomeView(){
        return "index";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String getErrorView(){
        return "error";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContactView(){
        return "contact";
    }

    @RequestMapping(value = "/properties", method = RequestMethod.GET)
    public String getPropertiesView(){
        return "properties";
    }

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String getBlogView(){
        return "blog";
    }

    @RequestMapping(value = "/blog-detail", method = RequestMethod.GET)
    public String getBlogDetailView(){return "blog-detail"; }

    @RequestMapping(value = "/about-us", method = RequestMethod.GET)
    public String getAboutUsView(){
        return "about-us";
    }

    @RequestMapping(value = "/gallery", method = RequestMethod.GET)
    public String getGalleryView(){
        return "gallery";
    }

    @RequestMapping(value = "/property-detail-1", method = RequestMethod.GET)
    public String getPropertyDetail1View(){
        return "property-detail-1";
    }

}
