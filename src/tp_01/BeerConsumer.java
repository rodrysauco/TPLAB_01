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
public class BeerConsumer extends Thread
{
    private BeerHouse bh;
    
    public BeerConsumer(BeerHouse bh){
        this.bh = bh;
    }

    @Override
    public void run() {
        while(bh.getCervezas() > 0){
            this.bh.comprar();
            System.out.println("Quedan "+bh.getCervezas());
        }
        bh.detener();
    }
}
