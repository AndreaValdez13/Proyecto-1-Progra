package Facturacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import Informacion.Clientes;
/**
 *
 * @author melis
 */
public class Facturacion {
    Scanner in = new Scanner (System.in);
    int[] Correlativo;
    int FormaPago;
    int Cantidad; //Productos
    double total[];
    int opc;
    
    public Facturacion(){
        this.Correlativo = new int [10];
        this.FormaPago = 0;
        this.Cantidad = 0;
        this.total = new double [100];
        this.opc = 0;
    }
  
    public void EncaFactura(){
        Clientes cl;
        cl = new Clientes();
        System.out.println("\n******FACTURACION******");
        cl.EncaClientes();
    }
    
}

