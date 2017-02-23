/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coophorizontal.dtos;

/**
 *
 * @author grupodot
 */
public class ProductoMagDto {
    
    public int id;
    public String nombre;
    public String direccion;
    public String cliente;
    
    
    public ProductoMagDto(String name, String direccion, String cliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cliente = cliente;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.direccion = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.direccion = cliente;
    }    
    
}
