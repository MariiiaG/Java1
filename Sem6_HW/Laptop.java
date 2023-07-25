package Java1.Sem6_HW;

import Java1.Sem6.Cat;

/**
 * Laptops
 */
public class Laptop {
    Integer id;
    String brand;
    Integer ram;
    String os;
    Integer price;
    String colour;
    
        public Laptop(int id, String brand, int ram, String os, int price, String colour) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.os = os;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                ", Brand: " + brand +
                ", RAM: " + ram + "гБ" +
                ", OS: " + os +
                ", Price: " + price + "р." +
                ", Colour: " + colour;
    }

    @Override
    public int hashCode() {
        return id.hashCode() + 7*brand.hashCode() + 13*price.hashCode() + 11*ram.hashCode() + colour.hashCode(); 
    } 

    @Override
    public boolean equals(Object obj) {
        if (this == obj){ 
            return true;
        }
        if (!(obj instanceof Laptop)){
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return id == laptop.id && 
        brand.equalsIgnoreCase(laptop.brand) && 
        colour.equalsIgnoreCase(laptop.colour) && 
        ram == laptop.ram &&
        price == laptop.price &&
        os.equalsIgnoreCase(laptop.os);
    }
}