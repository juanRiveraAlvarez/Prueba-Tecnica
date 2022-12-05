package com.saveservice.saveservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cilindrajeVehiculo;
    private String tipoVehiculo;
    private int blidado;
    private int valorComercial;
    private int avaluo;
    private int impuesto;

    public Registro(int cilindrajeVehiculo, String tipoVehiculo, int blidado, int valorComercial, int avaluo, int impuesto) {
        super();
        this.cilindrajeVehiculo = cilindrajeVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.blidado = blidado;
        this.valorComercial = valorComercial;
        this.avaluo = avaluo;
        this.impuesto = impuesto;
    }

    public int getCilindrajeVehiculo() {
        return cilindrajeVehiculo;
    }

    public void setCilindrajeVehiculo(int cilindrajeVehiculo) {
        this.cilindrajeVehiculo = cilindrajeVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getBlidado() {
        return blidado;
    }

    public void setBlidado(int blidado) {
        this.blidado = blidado;
    }

    public int getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(int valorComercial) {
        this.valorComercial = valorComercial;
    }

    public int getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(int avaluo) {
        this.avaluo = avaluo;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }
}
