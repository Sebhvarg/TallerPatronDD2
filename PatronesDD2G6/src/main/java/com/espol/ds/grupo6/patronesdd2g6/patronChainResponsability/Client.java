/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.patronesdd2g6.patronChainResponsability;

/**
 *
 * @author sebas
 */
public class Client {
    Handler UsuarioAsistente = new UserAssistantHandler();
    Handler DepartamentoTecnico = new TechnicalMemberHandler();
    public void changeRequest(Request r){
        UsuarioAsistente.handleRequest(r);
    
    }
}
