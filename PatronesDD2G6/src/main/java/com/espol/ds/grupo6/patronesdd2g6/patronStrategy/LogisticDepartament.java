/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.patronesdd2g6.patronStrategy;

/**
 *
 * @author sebas
 */
public class LogisticDepartament implements Department{
    private Distribution delivery = new CarDelivery();
    public void SetDistribution(Distribution d){
        d = delivery;

    }
    
    public void distribute(){
        delivery.distribute();
    
    }
    
}
