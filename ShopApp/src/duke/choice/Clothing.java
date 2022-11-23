/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author Emiliano
 */
public class Clothing implements Comparable <Clothing>{
    private String description;
    private double price=0.0;
    private String size="M";
    public static final double MINIMUN_PRICE=10;
    public static final double TAX=0.2;
           

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return (TAX*price)+price;
        
    }

    public void setPrice(double price) {
        this.price = (price>MINIMUN_PRICE)?price:MINIMUN_PRICE;
        /*if (price<MINIMUN_PRICE){
            System.out.println("El valor no es apto");
        }*/
        
    }

   

    public Clothing(String description, double price, String size) {
        this.description = description;
        setPrice(price);
        setSize(size);
    }
    
    

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
     @Override
    public String toString() {
        return getDescription()+","+getSize()+","+getPrice();
    }
    
    @Override
    public int compareTo (Clothing c){
        return this.description.compareTo(c.description);
    }
    
}
