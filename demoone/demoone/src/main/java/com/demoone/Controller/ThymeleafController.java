package com.demoone.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {
    @RequestMapping(value="/hello")
    public String index(ModelMap map){
        map.addAttribute("name","你的名字是");
        return "indexThy";
    }
}
