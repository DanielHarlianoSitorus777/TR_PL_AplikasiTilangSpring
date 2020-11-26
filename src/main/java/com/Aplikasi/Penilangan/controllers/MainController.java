package com.Aplikasi.Penilangan.controllers;

import com.Aplikasi.Penilangan.entities.Tilang;
import com.Aplikasi.Penilangan.repositories.TilangRepository;
import com.Aplikasi.Penilangan.services.TilangServices;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    Scanner in = new Scanner(System.in);

    @Autowired
    TilangServices tilangService;
        
    //view
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("tilang", new Tilang());
        model.addAttribute("tilangs", tilangService.getAll());
        return "index";
    }

    //getbyId
    @GetMapping("get/{id}")
    public String getById(Model model, @PathVariable("id") int id){
        model.addAttribute("tilang", tilangService.getById(id));
        model.addAttribute("tilangs", tilangService.getAll());
        return "index";
    }
    
    //insert
    @PostMapping("/save")
    public String save(Tilang tilang){
        tilangService.save(tilang);
        return "redirect:/";
    }
    
    @PostMapping("/delete")
    public String delete(Tilang tilang){
        tilangService.delete(tilang.getTilangId());
        return "redirect:/";
    }
}