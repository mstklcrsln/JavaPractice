package courseTasks.thirdMonth.day35Tasks;

public class Candy {
        private String brand;
        private int quantity;
        private double price;
        private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
       setBrand(brand);
       setQuantity(quantity);
       setPrice(price);
       setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPrice() {
        String cost ="";
        if (price==0){
            cost="free";
        } else
            cost=""+ price;
        return cost;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if (quantity<1){
            System.out.println("Invalid entry");
            return;
        } else
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price<1){
            System.out.println("Invalid Entry");
            return;
        } else
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
/*
 1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)
                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)
                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0
 */