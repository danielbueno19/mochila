/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;
import java.util.Collections;
import java.util.Vector;
import java.util.Comparator;
/**
 *
 * @author utp
 */
public class ProgramacionDinamica {
    
    public class mochila{
        Vector<Elemento> almacen= new Vector<Elemento>();
        Vector<Elemento> mochila= new Vector<Elemento>();
        double pesoMaximo;
        
        public void problemaMochila(){
            cargarDatos();
        }
        
        public void cargarDatos(){
            almacen.add(new Elemento("TV",300,15));
            almacen.add(new Elemento("PS3",100,3));
            almacen.add(new Elemento("DVD",200,8));
            almacen.add(new Elemento("Libro",400,23));
            almacen.add(new Elemento("PC",1100,30));
            almacen.add(new Elemento("Radio",55,6));
            almacen.add(new Elemento("VideoBeans",350,13));
            almacen.add(new Elemento("Ventilador",80,7));
            almacen.add(new Elemento("Impresora",200,4));
            almacen.add(new Elemento("Celular",40,1));
            almacen.add(new Elemento("Carpa",300,8));
        }
        
        public void mostarMochila(){
            double pesoMochila=0;
            double valorMochila=0;
            System.out.println("");
            
            for(Elemento e: mochila){
                System.out.println(e);
                pesoMochila += e.peso;
                valorMochila += e.valor;
            }
            System.out.println("______________");
            System.out.println("peso === 12.f%"+ pesoMochila);
            System.out.println("peso === 12.f%"+ valorMochila);
        }
        
        public void resolverProblema(){
            
            Comparator comp= new Comparator<Elemento>(){
                public int compare(Elemento x, Elemento y){
                    return (int)(x.valor - y.valor);
                }
            };
            
            Collections.sort(almacen, comp);
            Collections.reverse(almacen);
            
            
            double pesoMochila=0;
            int posicion=0;
            
            while(pesoMochila< pesoMaximo && posicion < almacen.size()){
                Elemento temp= almacen.get(posicion);
                
                if(pesoMochila+ temp.peso <= pesoMaximo){
                    mochila.add(temp);
                    pesoMochila += temp.peso; 
                }
                posicion++;
            }
        }
    }
}
