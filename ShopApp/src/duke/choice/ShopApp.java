/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author Emiliano
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        // TODO code application logic here
        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("Pinky XD", 14);
        
 
        int measurement = 8;
        c1.setSize(measurement);

        System.out.println(c1.getName());
        System.out.println(c1.getSize());

        //Clothing
        System.out.println(Clothing.MINIMUN_PRICE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, 
        new Clothing("Green Scarf", 5, "S"), 
        new Clothing("Blue T-Shirt", 10.5, "S")};
        
        c1.addItems(items);
       // System.out.println("Customer" + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothinCost());
        for (Clothing item : c1.getItem()) {
            System.out.println("Items" + item);

        }
        
        
        int average=0;
        int count=0;
        for(Clothing item:c1.getItem()){
            if (item.getSize().equals("L")){
                 count++;
                 average+=item.getPrice();       
               } 
            }
            try{
               average=average/count;
               System.out.println("Average: "+average+", Count: "+count);  
            }catch(ArithmeticException e){
                System.out.println("Don´t divide by zero");
            }     
            Arrays.sort(c1.getItem());
                for (Clothing item : c1.getItem()) {
            System.out.println("Items" + item);

            }
        }
             
        //total=((item1.price+(item2.price*2))*tax)+(item1.price+(item2.price*2));
    }


