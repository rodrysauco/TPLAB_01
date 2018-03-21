/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_01;

/**
 *
 * @author Sandy
 */
public class BeerHouse
{
    private int cervezas;
    private boolean stock;
    
    public BeerHouse (){
        this.cervezas = 0;
        }
    
    public synchronized void comprar(){
        while(!this.stock){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.err.println("Error al consumir "+ e.getMessage());
            }
        }  
        this.cervezas -= 1;
        notify();
        
    }
    
    public synchronized void producir(){
        while(this.cervezas > 100){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.err.println("Error al producir " + e.getMessage());
            }            
        }
        this.cervezas += 1;
        this.stock = this.cervezas > 0;
        notify();
    }
    public void detener(){
        this.stock = false;
    }
    public boolean getStock(){
        return this.stock;
    }
    
    public int getCervezas(){
        return this.cervezas;
    }
}
