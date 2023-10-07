package com.example.Sprint3.entidades;

import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "UnidadMedida")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class UnidadMedida extends Base {

    @NotNull
    @Column(length = 255)
    private String denominacion;

    @NotNull
    @Column(length = 25)
    private String abreviatura;

    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @NotNull
    @Builder.Default
    @JoinColumn(name = "id_articulos_Insumo")
    private List<ArticuloInsumo> articulosInsumo = new ArrayList<>();

    public void agregarArticulosInsumo(ArticuloInsumo a){
        articulosInsumo.add(a);
    }

}
