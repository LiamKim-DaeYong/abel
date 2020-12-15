package com.abel.system.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/sys/menu")
    public String menu() {
        return "system/menu/menuList";
    }
}
