package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();

		// PulaLinha
		System.out.println();
		System.out.println("Product data: " + product);

		// PulaLinha
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		// PulaLinha
		System.out.println();
		System.out.println("Update data: " + product);

		// PulaLinha
		System.out.println();
		System.out.printf("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());

		// PulaLinha
		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();
	}

}
