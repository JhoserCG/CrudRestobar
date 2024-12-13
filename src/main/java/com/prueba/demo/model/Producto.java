/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Alumno
 */
@Entity
@Table(name = "producto")
@Getter
@Setter
public class Producto {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
        @Column(name = "NOMBRE-PRODUCTO", nullable = false)
    private String nombreProducto;
        @Column(name = "DESCRIPCION-PRODUCTO", nullable = false)
    private String descripcionProducto;
        @Column(name = "PRECIO", nullable = false)
    private double precio;
        @Column(name = "STOCK", nullable = false)
    private long stock;
        @Column(name = "TIPO", nullable = false)
    private String tipo;
    
}
