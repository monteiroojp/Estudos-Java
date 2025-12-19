package practicesPOO.practice2;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
        return "Product data: " +
                name +
                ", $ " +
                price +
                ", " +
                quantity +
                " units, Total: $ " +
                totalValueInStock();
    }
}
