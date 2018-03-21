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
public class BeerProducter extends Thread
{
    private BeerHouse bh;
        
    public BeerProducter (BeerHouse bh){
        this.bh = bh;
    }
  
    @Override
    public void run()
    {
        do{
            this.bh.producir();
            System.out.println("Cervezas en stock "+bh.getCervezas());
        }
        while(bh.getCervezas() < 100 && bh.getStock() == true);        
    }
}
