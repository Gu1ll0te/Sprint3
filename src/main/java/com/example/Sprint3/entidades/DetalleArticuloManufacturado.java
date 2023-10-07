package com.example.Sprint3.entidades;

import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "DetalleArticuloManufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class DetalleArticuloManufacturado extends Base {

    @NotNull
    @Column(name = "cantidad", precision = 10, scale = 2)
    private int cantidad;

}
