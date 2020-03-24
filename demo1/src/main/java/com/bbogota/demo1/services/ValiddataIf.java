/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbogota.demo1.services;

import com.bbogota.demo1.data.Resultdata;

/**
 *
 * @author camil
 */
public interface ValiddataIf {

    public boolean isvaliddata(String tipoid, String numid);

    public Resultdata getdata(String tipoid, String numid);
    
}
