/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbogota.demo1.services;

import com.bbogota.demo1.data.Resultdata;
import org.springframework.stereotype.Service;

/**
 *
 * @author camil
 */
@Service
public class Validationdata implements ValiddataIf {
    
    @Override
    public boolean isvaliddata(String tipoid, String numid){
        if(tipoid== null || numid==null){
            return false;
        }
        
        switch (tipoid){
            case "C":
            case "P":
                return true;                
            default : return false;
        }
        
        
    }
    
    
    @Override
    public Resultdata getdata(String tipoid, String numid){
        Resultdata resp= null;
        
        if("C".equals(tipoid) && "23445322".equals(numid)){
            resp = new Resultdata();
            resp.setCiudadresid("Bogota");
            resp.setPrimernomb("Jhenny");
            resp.setPrimerapell("Perez");
            resp.setDireccion("clle 1");
            resp.setTelefono("3333223");
 
        }
        return resp;
    }
    
    
    
}
