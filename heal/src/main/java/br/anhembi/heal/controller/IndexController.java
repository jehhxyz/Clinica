package br.anhembi.heal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "inicial";
    }

    @RequestMapping("/contato")
    public String contato() {
        return "contato";
    }

    @RequestMapping("/integrantes")
    public String integrantes() {
        return "integrantes";
    }

    @RequestMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @RequestMapping("/menu")
    public String menu() {
        return "menu";
    }
}
