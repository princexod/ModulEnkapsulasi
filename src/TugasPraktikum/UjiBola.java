/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author princexod
 */
public class UjiBola {
    public static void main(String[]args){
        double jari = 21;
            Bola objekbola=new Bola(14);
            objekbola.showDiameter();
            objekbola.showLuasPermukaan();
            objekbola.showVolume();
            System.out.println("\n");
            objekbola.setJari(jari);
            objekbola.showDiameter();
            objekbola.showLuasPermukaan();
            objekbola.showVolume();
           
    }
}
