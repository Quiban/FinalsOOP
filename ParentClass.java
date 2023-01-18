/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restoo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ParentClass {
    
    public double ChickenFillet;
    public double BurgerWithFries;
    public double FriedChicken;
    public double ComboMeal;
    
    public double SoftDrinks;
    public double MilkTea;
    public double Juice;
   
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
     public double AllTotalofMD;
    
    
    public double getAmount()
    {
        Meals = ChickenFillet + BurgerWithFries + FriedChicken + FriedChicken + ComboMeal;
        Drinks = SoftDrinks + MilkTea + Juice;
        TotalofMD = Meals + Drinks ;
        AllTotalofMD = Meals; 
        return AllTotalofMD + Drinks; 
    }
    
    private JFrame frame; 
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm  if you want to exit", "WARA'S Restaurant",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){

            System.exit(0);
        }
    }
    
    
    //======================Price===========================
    
    public double pChickenFillet = 5.25;
    public double pBurgerWithFries = 4.65;
    public double pFriedChicken = 7.60;
    public double pComboMeal = 12.20;
    
    public double pSoftDrinks = 1.50;
    public double pMilkTea = 2.50;
    public double pJuice = 1.50;
    
    //+=====================================================
    
    public double mcTax = 2.80;
    
    public double cFindTax(double cAmount)
    {
      double FindTax = cAmount +(cAmount -  mcTax);
      return FindTax;       
    }
    //======================================================
   
}
