package com.methaphorse.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String findAll(){

        return "prueba";
    }
    
    @GetMapping(value = "/saludo2", produces = MediaType.TEXT_PLAIN_VALUE)
    public String findAll2(Pageable pageable){

        return "prueba2";
    }

    @GetMapping(value = "/saludo3", produces = MediaType.TEXT_PLAIN_VALUE)
    public String findAll3(Pageable pageable){

        return "prueba3";
    }


}
