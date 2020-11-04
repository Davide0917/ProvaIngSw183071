package it.unical.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyListUtil list = new MyListUtil();
        System.out.println("Premi 1 per lista crescente premere 2 per lista in ordine decrescente");
        Scanner myIn = new Scanner(System.in);
        int decisione = myIn.nextInt();
        
        System.out.println("Inserisci Lista termina con 0");
        List<Integer> listOrdina = new LinkedList<Integer>();
        
        int in = myIn.nextInt();
        while(in != 0) {
        	listOrdina.add(in);
        	in = myIn.nextInt();
        }
        
        if( decisione == 1)
        	System.out.println(list.setCrescenteList(listOrdina));
        else 
        	System.out.println(list.setDecrescenteList(listOrdina));
    }
}
