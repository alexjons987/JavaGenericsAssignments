package assignment.five;

public class Order {
    int id;
    String customerName;
    int amount;
    boolean completed;

    public Order(int id, String customerName, int amount, boolean completed) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeOrder() {
        this.completed = true;
    }

    public String toString() {
        return String.format(
                "ID: %d, Customer: %s, Amount: %d, Is completed: %s",
                this.id,
                this.customerName,
                this.amount,
                this.completed
        );
    }
}
