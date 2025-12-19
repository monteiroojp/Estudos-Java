package practicesPOO.practice5.exercise1;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    //Getters
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}

    //Setters
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}

    //Methods
    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if(this.quantity - quantity < 0)
            this.quantity = 0;
        else
            this.quantity -= quantity;
    }

    //Override of toString
    public String toString(){
        return  name +
                ", $ " +
                String.format("%.2f", price) +
                ", " +
                quantity +
                " units, Total: $ " +
                totalValueInStock();
    }
}
