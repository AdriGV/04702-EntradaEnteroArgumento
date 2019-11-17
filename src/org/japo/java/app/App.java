/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CicloM
 */
public final class App {
    
    //Scan
    public static final Scanner SCN = 
	  new Scanner(System.in, "ISO-8859-1")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    //constantes
    public static final String MSG_USR = "Introducir número ....: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";
    public static final String MSG_OUT = "Número introducido ...: ";
            
    public final void launchApp() {
        
        //Cabecera
        System.out.println("INTRODUCCIÓN ENTERO ");
        System.out.println("=================== ");
        
        //Introducir dato
        int n = (int) obtener (MSG_USR, MSG_ERR);
        
        //Separador
        System.out.println("---");
        
        //mostrar dato
        System.out.printf(MSG_OUT + "%d%n", n);
        

    }
    
    public static final double obtener (String msgUsr, String msgErr) {
    double numero= 0;
    boolean errorOK = true;
    do{
        try{
            System.out.print(MSG_USR);
            numero = SCN.nextDouble();
            errorOK = false;
        } catch (Exception e){
            System.out.println(MSG_ERR);
            System.out.println("---");
        } finally{
            SCN.nextLine();
        }
    }while (errorOK);
    
    return numero;
    
    
}
}
