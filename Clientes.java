/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;
import java.util.Scanner;
import LaTiendita.MenuPrincipal;
/**
 *
 * @author melis
 */
public class Clientes {
Scanner in = new Scanner (System.in);
int [] idCliente;
String [] NCliente;
String [] ApCliente;
int [] Nit;
String [] Direccion;
double[] creditoD;
int opc;
int i;
    
    public Clientes(){
        this.idCliente = new int [10];
        this.NCliente = new String [10];
        this.ApCliente = new String [10];
        this.Nit = new int[10];
        this.Direccion = new String [10];
        this.creditoD = new double [10];
        this.opc = 0;
        this.i = 0;
    }

    public void MenuC(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
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
            LaT.Menu();
        }else if (opc == 4){
            EncaClientes();
        }
    }
    
    public void ConsultaC(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
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
            }
            System.out.println("\n ¿Desea realizar otra consulta? \n 1.Si \n 2.Regresar al menu");
            opc = in.nextInt();
                if(opc == 1){
                    ConsultaC();
                }else if(opc == 2){
                    LaT.Menu();
                }
        }           
    }
    
    public void ingresoClientes(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
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
            System.out.println("\n***CLIENTE CREADO CON EXITO***\n");
            i++;
            System.out.println("\n¿Desea agregar otro Cliente?\n1.Si\n2.Consulta\n3.Regresar al menu \n");
            opc = in.nextInt();

            if(opc == 1){
                ingresoClientes();
            } else if (opc == 2){
                ConsultaC();
            }else if (opc == 3){
                LaT.Menu();
            }
        }while(i<10);
    }
    
    public void EncaClientes(){
        MenuPrincipal LaT;
        LaT = new MenuPrincipal();
        Productos pr;
        pr = new Productos();
        int foo = 0;
        
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
                
                pr.DetalleFact();
            }
        }   
    } 
}
