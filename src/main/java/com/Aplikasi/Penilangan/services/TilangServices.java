///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.Aplikasi.Penilangan.services;
//
//import com.Aplikasi.Penilangan.entities.Tilang;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.Aplikasi.Penilangan.repositories.TilangRepository;
//
//
///**
// *
// * @author Daniel Harliano
// */
//@Service
//public class TilangServices {
//    
//    @Autowired
//    TilangRepository repository;
//
//    public List<Tilang> getAll() {
//        return repository.findAll();
//    }
//
//    public Tilang getById(int id) {
////        return repository.getOne(id);
//        return repository.findById(id).get();
//    }
//
//    public Tilang save(Tilang region) {
//        return repository.save(region);
//    }
//
//    public void delete(int id) {
//        repository.delete(new Tilang(id));
//    }
//}
