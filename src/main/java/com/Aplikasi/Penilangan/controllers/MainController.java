package com.Aplikasi.Penilangan.controllers;

import com.Aplikasi.Penilangan.entities.Tilang;
import com.Aplikasi.Penilangan.repositories.TilangRepository;
//import com.Aplikasi.Penilangan.services.TilangServices;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    Scanner in = new Scanner(System.in);

//    @Autowired
//    TilangServices tilangService;
    
    @Autowired
    TilangRepository tilangRepository;
        
//    //view
//    @GetMapping("")
//    public String index(Model model){
//        model.addAttribute("tilang", new Tilang());
//        model.addAttribute("tilangs", tilangService.getAll());
//        return "index";
//    }
//
//    //getbyId
//    @GetMapping("get/{tilangId}")
//    public String getById(Model model, @PathVariable("tilangId") int tilangId){
//        model.addAttribute("tilang", tilangService.getById(tilangId));
//        model.addAttribute("tilangs", tilangService.getAll());
//        return "index";
//    }
//    
//    //insert
//    @PostMapping("/save")
//    public String save(Tilang tilang){
//        tilangService.save(tilang);
//        return "redirect:/";
//    }
//    
//    @PostMapping("/delete")
//    public String delete(Tilang tilang){
//        tilangService.delete(tilang.getTilangId());
//        return "redirect:/";
//    }
//    
    
    @RequestMapping("/tilang")
    public String tilang(Model model){
        model.addAttribute("tilangs", tilangRepository.findAll());
        return "tilang";
    }
    
    @RequestMapping("/create")
    public String create(Model model){
        return "create";
    }
    
    @RequestMapping("/save")
    public String save(@RequestParam String tilangName, @RequestParam String tilangPlat,
            @RequestParam String tilangPelanggaran, @RequestParam String tilangKendaraan){
        Tilang tilang = new Tilang();
        tilang.setTilangName(tilangName);
        tilang.setTilangPlat(tilangPlat);
        tilang.setTilangPelanggaran(tilangPelanggaran);
        tilang.setTilangKendaraan(tilangKendaraan);
        tilangRepository.save(tilang);
        
        return "redirect:/tilang";
    }
    
    @RequestMapping("/show/{tilangId}")
    public String show(@PathVariable int tilangId, Model model){
        model.addAttribute("tilang", tilangRepository.findById(tilangId).orElse(null));
        return "show";
    }
    
    @RequestMapping("/delete")
    public String delete(@RequestParam int tilangId){
        Tilang tilang = tilangRepository.findById(tilangId).orElse(null);
        tilangRepository.delete(tilang);
        
        return "redirect:/tilang";
    }
    
    @RequestMapping("/edit/{tilangId}")
    public String edit(@PathVariable Integer tilangId, Model model){
        model.addAttribute("tilang", tilangRepository.findById(tilangId).orElse(null));
        return "edit";
    }
    
    
    @RequestMapping("/update")
    public String update(@RequestParam Integer tilangId, @RequestParam String tilangName, 
            @RequestParam String tilangPlat, @RequestParam String tilangPelanggaran,
            @RequestParam String tilangKendaraan){
        Tilang tilang = tilangRepository.findById(tilangId).orElse(null);
        tilang.setTilangName(tilangName);
        tilang.setTilangPlat(tilangPlat);
        tilang.setTilangPelanggaran(tilangPelanggaran);
        tilang.setTilangKendaraan(tilangKendaraan);
        tilangRepository.save(tilang);
        
        return "redirect:/tilang";
    }
    
    @RequestMapping("/index")
    public String index(Model model){
        return "index";
    }
}