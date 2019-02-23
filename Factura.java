/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latiendita1;

import static java.lang.System.exit;
import java.util.Scanner;


/**
 *
 * @author melis
 */
public class Factura {
    Scanner in = new Scanner(System.in);
    int [] idCliente;
    String [] NCliente;
    String [] ApCliente;
    int [] Nit;
    String [] Direccion;
    double [] creditoD;
    int [] idProducto;
    String [] NProducto;
    double [] PrecioProducto;
    int [] StockProducto;
    String [] CatProducto;
    int[] cantidad;
    double[] subtotal;
    double [] Total;
    int usuario;
    int contraseña;
    double creditoN;
    double efectivo;
    double tarjeta;
    double cheque;
    
    public Factura(){
        this.idCliente = new int [10];
        this.NCliente = new String [10];
        this.ApCliente = new String [10];
        this.Nit = new int[10];
        this.Direccion = new String [10];
        this.creditoD = new double [10];
        this.idProducto = new int [10];
        this.NProducto = new String [10];
        this.PrecioProducto = new double [10];
        this.StockProducto = new int [10];
        this.CatProducto = new String [10];
        this.cantidad = new int [10];
        this.subtotal = new double [10];
        this.Total = new double [10];
        this. usuario = 0;
        this.contraseña = 0;
        this.creditoN = 0;
        this.efectivo = 0;
        this.tarjeta = 0;
        this.cheque = 0;
    }
    
    public void Login(){
        System.out.println("******BIENVENIDO*******\n");
        System.out.println("Ingrese su usuario");
        usuario = in.nextInt();
        System.out.println("Ingrese su contraseña");
        contraseña = in.nextInt();
        
        if(usuario == 2010 && contraseña == 2019){
            Menu();
        }else if(usuario != 2010 && contraseña == 2019){
            System.out.println("\nSU USUARIO ES INCORRECTO\n");
            Login();
        }else if(usuario == 2010 && contraseña != 2019){
            System.out.println("SU CONTRASEÑA ES INCORRECTA\n");
            Login();
        }else{
            System.out.println("USUARIO Y CONTRASEÑA INCORRECTOS\n");
            Login();
        }
    
    }
    
    public void Menu(){
        int opcion;
        opcion = 0;
            System.out.println("\n******MENU******\n");
            System.out.println("1. Facturas");
            System.out.println("2. Clientes");
            System.out.println("3. Productos");
            System.out.println("4. Corte de Caja");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            
                if(opcion == 1){
                    System.out.println("******FACTURACION**********");
                    for(int r = 0; r <10; r++){
                    
                    }
                    EncaClientes();
                }else if(opcion == 2){
                    MenuC();
                }else if(opcion == 3){
                    MenuP();
                }else if (opcion == 4){
                    CorteCaja();
                }else if (opcion == 5){
                    exit (0);
                }
    }
    
    public void MenuC(){
        int opc;
        opc = 0;
        System.out.println("\n***MENU CLIENTES***\n");
        System.out.println("1. Ingreso Clientes");
        System.out.println("2. Consulta Clientes");
        System.out.println("3. Regresar");
        opc = in.nextInt();
       
        if(opc == 1){
            ingresoClientes();
        }else if (opc == 2){
            ConsultaC();
        }else if (opc == 3){
            Menu();
        }else if (opc == 4){
            EncaClientes();
        }
    }
    
    public void ingresoClientes(){
        int opc, i;
        opc = 0;
        i = 0;
        System.out.println("\n***INGRESO DE CLIENTES***\n");
        
        do{
            System.out.println("\nIngrese idCliente: ");
            idCliente[i] = in.nextInt();
            in.nextLine();
            System.out.println("Ingrese Nombre de Cliente: ");
            NCliente[i] = in.nextLine(); 
            System.out.println("Ingrese Apellido Cliente: ");
            ApCliente[i] = in.nextLine();
            System.out.println("Ingrese Nit Cliente: ");
            Nit[i] = in.nextInt();
            System.out.println("Ingrese Credito Cliente: ");
            creditoD[i] = in.nextDouble();
            System.out.println("\n***CLIENTE CREADO CON EXITO***\n");
            i++;
            System.out.println("\n¿Desea agregar otro Cliente?\n1.Si\n2.Consulta\n3.Regresar al menu \n");
            opc = in.nextInt();

            if(opc == 1){
                ingresoClientes();
            } else if (opc == 2){
                ConsultaC();
            }else if (opc == 3){
                Menu();
            }
        }while(i<10);
    }

    public void ConsultaC(){ 
        int opc, i;
        opc = 0;
        i = 0;
        System.out.println("\nIngrese Id del cliente que desea consultar");
        i = in.nextInt();
        for(int p =0; p < idCliente.length; p++){
            if(idCliente[p]==i){
                System.out.println("\nIdCliente: " + idCliente[p] );
                System.out.println("---------------------\n");
                System.out.println("Nombre: " + NCliente[p]);
                System.out.println("---------------------\n");
                System.out.println("Apellido: " + ApCliente[p]);
                System.out.println("---------------------\n");
                System.out.println("Nit: " + Nit[p]);
                System.out.println("---------------------\n");
                System.out.println("Credito Disponible: " + creditoD[p]);
                System.out.println("---------------------\n");
            }else{
                System.out.println("\nCliente No Registrado\n");
                ConsultaC();
            }
            
            System.out.println("\n ¿Desea realizar otra consulta? \n 1.Si \n 2.Regresar al menu");
            opc = in.nextInt();
                if(opc == 1){
                    ConsultaC();
                }else if(opc == 2){
                    Menu();
                }
        }          
    }
    
    public void EncaClientes(){
        int foo;
        foo = 0;
        System.out.println("\nIntroduzca idCliente para facturacion:");
        foo = in.nextInt();
        for(int p = 0; p < idCliente.length; p++){
            if(idCliente[p]== foo){
                System.out.println("\nIdCliente: " + idCliente[p]);
                System.out.println("---------------------\n");
                System.out.println("Nombre: " + NCliente[p]);
                System.out.println("---------------------\n");
                System.out.println("Apellido: " + ApCliente[p]);
                System.out.println("---------------------\n");
                System.out.println("Nit: " + Nit[p]);
                System.out.println("---------------------\n");
                System.out.println("Credito Disponible: " + creditoD[p]);
                System.out.println("---------------------\n");
            }else{
                System.out.println("\nCliente No Encontrado\n");
                EncaClientes();
            }
            DetalleFact();
        }   
    }
    
    public void MenuP(){
        int opc; 
        opc = 0;
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
            Menu();
       }
    }
    
    public void ingresoProductos(){
        int opc, i;
        opc = 0;
        i = 0;
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
                Menu();
            }
        }while(i<10);
    }
    
    public void ConsultaP(){
        int opc, i;
        i = 0;
        opc = 0;
        System.out.println("\nIngrese Id del producto que desea consultar");
        i = in.nextInt();     
            
        for (int p=0;p<=idProducto.length-1;p++){
            if(idProducto[p] == i){
                System.out.println("\nIdProducto: " + idProducto[p] );
                System.out.println("---------------------\n");
                System.out.println("Nombre: " + NProducto[p]);
                System.out.println("---------------------\n");
                System.out.println("Precio: " + PrecioProducto [p]);
                System.out.println("---------------------\n");
            }else{
                System.out.println("\nProducto No Registrado\n");
                ConsultaP();
            }         
            System.out.println("\n ¿Desea realizar otra consulta? \n 1.Si \n 2.Regresar al menu");
            opc = in.nextInt();
                if(opc == 1){
                    ConsultaP();
                }else if(opc == 2){
                    Menu();
                }
        }      
    }
    
    public void DetalleFact(){
        int opc, i, foo, fp;
        i = 0;
        foo = 0;
        opc = 0;
        fp = 0;
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
        
        for(int s = 0; s <subtotal.length; s++){
            System.out.println("\nCantidad: ");
            opc = in.nextInt();
            cantidad [s] = opc;
            subtotal[s] = cantidad [s] * PrecioProducto[s];
            System.out.println("Total: " + subtotal[s]);   
                    Total[i] = subtotal[s];
                
                    System.out.println("\nEl total de su factura es: Q" + Total[i]);
                    System.out.println("Seleccione Forma de Pago:\n1.Efectivo\n2.Tarjeta de Credito\n3.Cheque ");
                    fp = in.nextInt();
                        if(fp == 1){
                            efectivo += Total[i];
                        } else if(fp == 2){
                            tarjeta += Total[i];
                            creditoN = creditoD[s] - Total[i];
                            creditoD[s] = creditoN;
                            System.out.println("El nuevo credito del cliente es: Q" + creditoN);
                        } else if (fp == 3){
                            cheque += Total [i];
                        }
                    System.out.println("Pago Realizado con Exito\n");
                    System.out.println("Presione 0 para ir a menu");
                    opc = in.nextInt();
                    if(opc == 0){
                    Menu();
                    }
                    }
    }
    
    public void CorteCaja (){
        int salir;
        salir = 0;
         System.out.println("***CORTE DE CAJA***\n");
         System.out.println("Efectivo: Q" + efectivo);
        System.out.println("---------------------\n");     
        System.out.println("Tarjeta de Credito: Q" + tarjeta);
        System.out.println("---------------------\n");
        System.out.println("Cheque: Q" + cheque);
        System.out.println("---------------------\n");
        System.out.println("Cantidad a depositar: Q" + efectivo/2);
        System.out.println("Presione 1 para salir: ");
        salir = in.nextInt();
        if (salir == 1) {
            exit (0);
        }
         
    }
 
}
