/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.ds.grupo6.patronesdd2g6.patronIterator;

import static java.util.Spliterators.iterator;

/**
 *
 * @author sebas
 */
public class ConcreteIterator implements Iterator {
    private Product[] productos;
    private int index;

    @Override
    public boolean hasNext() {
        
        return (index >= productos.length );
        
    }

    @Override
    public Product nextIterator() {
        Product producto = productos[index];
        index++;
        return producto;
    }
}
