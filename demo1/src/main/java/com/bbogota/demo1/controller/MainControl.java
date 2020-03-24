/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbogota.demo1.controller;

import com.bbogota.demo1.data.Resultdata;
import com.bbogota.demo1.services.ValiddataIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camil
 */

@RestController
public class MainControl {
    
    @Autowired
    private ValiddataIf validdataIf;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/informacion/{tipoid}/{numid}")
    public ResponseEntity<?> getInformation(@PathVariable("tipoid") String tipoid, @PathVariable("numid") String numid) {
        System.out.println("consultando: tipo" + tipoid + "num" + numid);
        if(!validdataIf.isvaliddata(tipoid, numid)){
            return new ResponseEntity<>("datos incorrectos", HttpStatus.BAD_REQUEST);
        }
        Resultdata resul1 = validdataIf.getdata(tipoid,numid);        
        if(resul1!=null){
            return new ResponseEntity<>(resul1, HttpStatus.OK);
        }                
        return new ResponseEntity<>("no encontrado", HttpStatus.NOT_FOUND);
    }

}
