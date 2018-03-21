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
public class TP_01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        BeerHouse brew = new BeerHouse();
        BeerProducter pedro = new BeerProducter(brew);
        BeerConsumer papa = new BeerConsumer(brew);
        BeerConsumer carlos = new BeerConsumer(brew);
        pedro.start();
        papa.start();
        carlos.start();
    }
    
}
