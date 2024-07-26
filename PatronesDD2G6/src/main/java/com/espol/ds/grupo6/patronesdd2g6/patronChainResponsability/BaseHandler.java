/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.patronesdd2g6.patronChainResponsability;

/**
 *
 * @author sebas
 */
public class BaseHandler implements Handler {
    
    Handler h;

    @Override
    public void setNext(Handler h) {
        this.h = h;
    }

    @Override
    public void handleRequest(Request r) {
        // code logico 
    }
    
}
