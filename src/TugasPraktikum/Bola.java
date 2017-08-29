/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.lang.Math;
public class Bola {
  private double jari;
  public Bola (double jari){
      this.jari = jari;
  }
  
  public void setJari(double jari)
  {
      this.jari = jari;
  }
  public void showDiameter()
  {
      System.out.println("Diameter Bola adalah " + 2*jari);
  }
  public void showLuasPermukaan()
  {
      System.out.println("Luas Permukaan Bola adalah "+ (4/3*Math.PI*Math.pow(jari,3)));
  }
    public void showVolume()
   {
        System.out.println("Volume Bola adalah "+ (4*Math.PI*Math.pow(jari,2)));
   }
}
