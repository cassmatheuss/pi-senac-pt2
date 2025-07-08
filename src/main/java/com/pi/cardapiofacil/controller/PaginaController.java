/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pi.cardapiofacil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author matheus
 */
@Controller
public class PaginaController {
    @GetMapping("/")
    public String index() {
        return "cardapio";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "admin-cardapio";
    }
}
