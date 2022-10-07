package com.example.Fisa.Azure.HelloFisa.Hola;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaFisa {

    @RequestMapping("/")
    public String index(){
        return "Hola fisa";
    }
}
