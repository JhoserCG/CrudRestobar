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
@Table(name = "reserva")
@Getter
@Setter
public class Reserva {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
        @Column(name = "numero de clientes", nullable = false)
    private Int numeroPersona;
        @Column(name = "fecha de reserva", nullable = false)
    private LocalDate fechaReserva;
        @Column(name = "hora de reserva", nullable = false)
    private Date horaReserva;
        @Column(name = "nro de celular", nullable = false)
    private String numeroCel;
        @Column(name = "numero de mesa", nullable = false)
    private Int numeroMesa;
    
}