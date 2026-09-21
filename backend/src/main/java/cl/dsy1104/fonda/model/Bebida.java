package backend.src.main.java.cl.dsy1104.fonda.model;

import java.util.UUID;

public class Bebida {
    private String id;
    private String nombre;
    private TipoBebida tipo;
    private int volumenML;
    private int stock;
    private double gradosAlc;
    private boolean certificada;
    private int azucarXLitro;
    private boolean ventaRestringida;

    public Bebida(String nombre, TipoBebida tipo, int volumenML, int stock, boolean ventaRestringida) {

        this.id = UUID.randomUUID().toString();

        this.nombre = nombre;
        this.tipo = tipo;
        this.volumenML = volumenML;
        this.stock = stock;
        this.ventaRestringida = ventaRestringida;

        if  (tipo == TipoBebida.ALCOHOLICA) {

        }
    }
}
