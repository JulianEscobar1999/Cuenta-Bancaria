package cuenta;

import java.util.Scanner;


public class Cliente {
    public int nucuenta;
    public String nombre;
    private int clave;
    public float saldo;

    public Cliente(int nucuenta, String nombre, int clave, float saldo) {
        this.nucuenta = nucuenta;
        this.nombre = nombre;
        this.clave = clave;
        this.saldo = saldo;
    }
   //Cambio Contraseña
    public void cambio(int contra){
        System.out.println(nombre + " su nueva contraseña es: " + contra);
      clave=contra;
    }
    //Consiganacion y nuevo saldo
    public void saldo(float consigna){
        float suma = saldo+consigna;
        saldo = suma;
        System.out.println("El nuevo saldo de " + nombre +" es de "+ saldo);
    }
    
    //Consultar Saldo
    public void seesaldo(){
        System.out.println(nombre + " su saldo es de : " + saldo);
    }
    
    
    public static void main(String[] args) {
      Cliente magdalena = new Cliente(1012,"Magdalena Sanchez",1234,0);
      Cliente joselito = new Cliente(1013,"Joselito Perez",9876,500000);
      
      //Consiganacion a Magdalena
      magdalena.saldo(100000);
      
      //Cambio Contraseña Joselito
      joselito.cambio(8766);
      
      
      //Intento de hacerlo interactivo
      Scanner opcion = new Scanner(System.in);
      int op;
      System.out.println(" >>>>>>>>>>BIEVENDIDO<<<<<<<<<\n Seleccione la acción que desea realizar:\n \n 1. Consulta de saldo\n 2. Relizar Consiganacion\n 3. Cambio de Constraseña");
      op = opcion.nextInt();
      if(op==1){
          magdalena.seesaldo();
      }
      else if(op==2){
      Scanner transf = new Scanner(System.in);
      System.out.println("Ingrese el monto a consignar: ");
      float tran;
      tran = transf.nextFloat();
      magdalena.saldo(tran);
      }
      else if(op==3){
         Scanner necon = new Scanner(System.in);
      System.out.println("Ingrese su nueva contraseña");
      int cont;
      cont = necon.nextInt();
      magdalena.cambio(cont); 
      }
    }
         
}
