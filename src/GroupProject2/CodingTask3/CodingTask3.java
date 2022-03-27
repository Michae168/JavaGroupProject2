package GroupProject2.CodingTask3;

public class CodingTask3 {
    /*
    3. Create a Class Car that would have the following fields:
    carPrice and color and method calculateSalePrice() which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck.
    The Truck class has field as weight and has its own implementation of calculateSalePrice() method
    in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
}

/*
Create a Class Car that would have the following fields:
carPrice and color and method calculateSalePrice() which should be returning a price of the car.
 */
abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}
// Create 2 sub-classes: Truck and Sedan.

/*
The Truck class has field as weight and has its own implementation of calculateSalePrice() method
in which returned price calculated as following:
if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
 */
class Truck extends Car {
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return (carPrice - (carPrice * .1));
        } else {
            return (carPrice - (carPrice * .2));
        }
    }
}

/*
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return (carPrice - (carPrice * .05));
        } else {
            return (carPrice - (carPrice * .1));
        }
    }
}

// Test the code.
class CarTester {
    public static void main(String[] args) {
        Truck truck1 = new Truck(50000, "Blue", 3500);
        System.out.println("A truck with a MSRP of $" + truck1.carPrice + " that has a curb weight greater than 2000lbs has a final sales prices of $"
                + truck1.calculateSalePrice() + ".");

        Truck truck2 = new Truck(50000, "Blue", 1900);
        System.out.println("A truck with a MSRP of $" + truck2.carPrice + " that has a curb weight less than 2000lbs has a final sales prices of $"
                + truck2.calculateSalePrice() + ".");

        Sedan sedan1 = new Sedan(30000, "White", 22);
        System.out.println("A sedan with a MSRP of $" + sedan1.carPrice + " that has a length greater than 20 feet has a final sales prices of $"
                + sedan1.calculateSalePrice() + ".");

        Sedan sedan2 = new Sedan(30000, "White", 18);
        System.out.println("A sedan with a MSRP of $" + sedan2.carPrice + " that has a length greater than 20 feet has a final sales prices of $"
                + sedan2.calculateSalePrice() + ".");
    }
}

