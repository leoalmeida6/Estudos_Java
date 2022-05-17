package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	// M�TODOS
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name.toUpperCase()
				+ ", $ "
				+ String.format("%.2f", price)
				+ (", ")
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		}
}