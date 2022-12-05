package courseTasks.thirdMonth.day35Tasks;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small")) || (size.equalsIgnoreCase("medium")) || (size.equalsIgnoreCase("large"))) {
            System.out.println("Invalid entry " + size);
            System.exit(0);
        } else {
            this.size = size;
        }
    }
}

/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping
				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive
							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5
							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:
										small: 4
										medium: 5
										large: 6
				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)
				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
