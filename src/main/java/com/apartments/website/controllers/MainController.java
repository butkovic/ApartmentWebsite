package com.apartments.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
/**
 * Created by Petar Butkovic on 07/02/2016. controller
 */
@Controller
@RequestMapping("/")
public class MainController {
    int room = 0;

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

    /*@RequestMapping(value = "/property-detail-1", method = RequestMethod.GET)
    public String getPropertyDetail1View(){ return "property-detail-1"; }
    */
    @RequestMapping(value = "/property-detail-1", method = RequestMethod.GET)
    public String getRoomDetail1View(@RequestParam(value="room", required=false, defaultValue="1") String room, Model model) {
        model.addAttribute("room", room);
        return "property-detail-1";
    }
    @RequestMapping(value = "/property-detail-2", method = RequestMethod.GET)
    public String getRoomDetail2View(@RequestParam(value="room", required=false, defaultValue="2") String room, Model model) {
        model.addAttribute("room", room);
        return "property-detail-1";
    }
    @RequestMapping(value = "/property-detail-3", method = RequestMethod.GET)
    public String getRoomDetail3View(@RequestParam(value="room", required=false, defaultValue="3") String room, Model model) {
        model.addAttribute("room", room);
        return "property-detail-1";
    }
    @RequestMapping(value = "/property-detail-4", method = RequestMethod.GET)
    public String getRoomDetail4View(@RequestParam(value="room", required=false, defaultValue="4") String room, Model model) {
        model.addAttribute("room", room);
        return "property-detail-1";
    }
    @RequestMapping(value = "/property-detail-5", method = RequestMethod.GET)
    public String getRoomDetail5View(@RequestParam(value="room", required=false, defaultValue="5") String room, Model model) {
        model.addAttribute("room", room);
        return "property-detail-1";
    }
}
