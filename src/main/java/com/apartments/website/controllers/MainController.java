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

    public static final int big_apartment = 1;
    public static final int small_apartment = 2;
    public static final int big_apartment_2nd_floor = 3;
    public static final int small_apartment_2nd_floor = 4;
    public static final int house_marija = 5;

/*
    @RequestMapping(method = RequestMethod.GET)
    public String getIndexView(){
        return "coming-soon";
    }
*/
    @RequestMapping(method = RequestMethod.GET)
    public String getIndexView() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getHomeView2(){
        return "index";
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
/*
    @RequestMapping(value = "/blog-detail", method = RequestMethod.GET)
    public String getBlogDetailView(){return "blog-detail"; }


    @RequestMapping(value = "/about-us", method = RequestMethod.GET)
    public String getAboutUsView(){
        return "about-us";
    }
*/
    @RequestMapping(value = "/gallery", method = RequestMethod.GET)
    public String getGalleryView(){
        return "gallery";
    }
/*
    @RequestMapping(value = "/gallery-atraction", method = RequestMethod.GET)
    public String getGalleryAtractionView(){
        return "gallery-atraction";
    }
*/

    @RequestMapping(value = "/big_apartment", method = RequestMethod.GET)
    public String getRoomDetail1View(Model model) {
        model.addAttribute("room", big_apartment);
        return "big_apartment";
    }
    @RequestMapping(value = "/small_apartment", method = RequestMethod.GET)
    public String getRoomDetail2View(Model model) {
        model.addAttribute("room", small_apartment);
        return "small_apartment";
    }
    @RequestMapping(value = "/big_apartment_2nd_floor", method = RequestMethod.GET)
    public String getRoomDetail3View(Model model) {
        model.addAttribute("room", big_apartment_2nd_floor);
        return "big_apartment_2nd_floor";
    }
    @RequestMapping(value = "/small_apartment_2nd_floor", method = RequestMethod.GET)
    public String getRoomDetail4View(Model model) {
        model.addAttribute("room", small_apartment_2nd_floor);
        return "small_apartment_2nd_floor";
    }
    @RequestMapping(value = "/house_marija", method = RequestMethod.GET)
    public String getRoomDetail5View(Model model) {
        model.addAttribute("room", house_marija);
        return "house_marija";
    }
}
