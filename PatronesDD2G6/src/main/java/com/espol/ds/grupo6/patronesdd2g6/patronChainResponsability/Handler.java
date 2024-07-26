/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.espol.ds.grupo6.patronesdd2g6.patronChainResponsability;

/**
 *
 * @author sebas
 */
public interface Handler {
    public void setNext(Handler h);
    public void handleRequest(Request r);
}
