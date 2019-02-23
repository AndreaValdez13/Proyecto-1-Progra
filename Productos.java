/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;
import LaTiendita.MenuPrincipal;
import java.util.Scanner;
/**
 *
 * @author melis
 */
public class Productos {
    public Scanner in = new Scanner (System.in);
    int [] idProducto;
    String [] NProducto;
    double [] PrecioProducto;
    int [] StockProducto;
    String [] CatProducto;
    int opc;
    int i;
    int[] cantidad;
    double[] subtotal;
    int foo;
    double [] Total;

    public Productos(){
        this.idProducto = new int [10];
        this.NProducto = new String [10];
        this.PrecioProducto = new double [10];
        this.StockProducto = new int [10];
        this.CatProducto = new String [10];
        this.opc = 0;
        this.i = 0;
        this.cantidad = new int [10];
        this.subtotal = new double [10];
        this.foo = 0;
        this.Total = new double [10];
    }

    public void MenuP(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
        System.out.println("\n***MENU PRODUCTOS***\n");
        System.out.println("1. Ingreso Productos");
        System.out.println("2. Consulta Productos");
        System.out.println("3. Regresar");
        opc = in.nextInt();
       
        if(opc == 1){
            ingresoProductos();
        }else if (opc == 2){
            ConsultaP();
        }else if (opc == 3){
            LaT.Menu();
       }
    }
 
    public void ConsultaP(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
        for (int p=0;p<=idProducto.length-1;p++){
            System.out.println("\nIngrese Id del producto que desea consultar");
            i = in.nextInt();     
            
            if(idProducto[p] == i){
                System.out.println("\nIdProducto: " + idProducto[p] );
                System.out.println("---------------------\n");
                System.out.println("Nombre: " + NProducto[p]);
                System.out.println("---------------------\n");
                System.out.println("Precio: " + PrecioProducto [p]);
                System.out.println("---------------------\n");
                
                System.out.println("\n ¿Desea realizar otra consulta? \n 1.Si \n 2.Regresar al menu");
                opc = in.nextInt();
                if(opc == 1){
                    ConsultaP();
                }else if(opc == 2){
                    LaT.Menu();
                }
            }         
        }      
    }
 
    public void ingresoProductos(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
        System.out.println("\n***INGRESO DE PRODUCTOS***\n");
        
        do{
            System.out.println("\nIngrese idProducto: ");
            idProducto[i] = in.nextInt();
            in.nextLine();
            System.out.println("Ingrese Nombre de Producto: ");
            NProducto[i] = in.nextLine();
            System.out.println("Ingrese Precio Producto: ");
            PrecioProducto[i] = in.nextDouble();
            System.out.println("***PRODUCTO CREADO CON EXITO***\n");
            i++;
            System.out.println("\n¿Desea agregar otro producto?\n1.Si\n2.Consulta\n3.Regresar a Menu Principal\n");
            opc = in.nextInt();

            if(opc == 1){
                ingresoProductos();
            } else if (opc == 2){
                ConsultaP();
            }else if (opc == 3){
                LaT.Menu();
            }
        }while(i<10);
    }
    
    public void DetalleFact(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
        Clientes cl;
        cl = new Clientes();
        int opc, i, foo;
        i = 0;
        foo = 0;
        opc = 0;
        System.out.println("\nIntroduzca idProducto para facturacion:");
        i = in.nextInt();
        for(int p =0; p < idProducto.length; p++){
            if(idProducto[p]==i){
                System.out.println("\nIdProducto: " + idProducto[p] );
                System.out.println("---------------------\n");
                System.out.println("\nNombre: " + NProducto[p] );
                System.out.println("---------------------\n");
                System.out.println("\nPrecio: " + PrecioProducto[p] );
                System.out.println("---------------------\n");
            }
        }
        
        for(int s = 0; s < 10; s++){
            System.out.println("\nCantidad: ");
            opc = in.nextInt();
            cantidad [s] = opc;
            subtotal[s] = cantidad [s] * PrecioProducto[s];
            System.out.println("Total: " + subtotal[s]);
          
            System.out.println("\n¡Desea finalizar factura: Presione 0\n Continuar: Presione 1\n");
            foo = in.nextInt();
                if(foo == 0){
                    for(int j = 0; j<subtotal.length;j++){
                    Total[i] += subtotal[j];
                }
                    System.out.println("\nEl total de su factura es: Q" + Total[i]);
                    LaT.Menu();
                }else if(foo == 1){
                    cl.EncaClientes();
                }   
        }
        }
}

