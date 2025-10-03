package assignment.task1;

import exceptions.InvalidAmountException;
import exceptions.OutOfStockException;

public class Product {
    private final String name;
    private int quantity;
    private int cost;

    public Product(String name, int quantity, int cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCost() {
        return cost;
    }

    public void sell(int amount) throws OutOfStockException, InvalidAmountException {
        if (amount > this.quantity) {
            throw new OutOfStockException(
                    String.format("Tried selling more than current stock (%d > %d)", amount, this.quantity)
            );
        } else if (amount < 1) {
            throw new InvalidAmountException(
                    String.format("You cannot sell 0 or negative amounts: %d", amount)
            );
        }

        this.quantity -= amount;

        System.out.printf("Sold %d of %s, new stock: %d%n", amount, this.name, this.quantity);
    }
}
