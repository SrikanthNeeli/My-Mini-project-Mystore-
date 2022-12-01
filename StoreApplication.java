package mystore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import mystore.CustomerProductsDTO;
import mystore.Product;
import mystore.Type;

public class StoreApplication {

	public static void main(String[] args) {
		
/*
  	Here the user will  add the products that are available
  	 in the store on that day 
 						*/
			Product milk = new Product(1, "milk", 60.00, Type.Liters);
			Product curd = new Product(2, "curd", 50.00, Type.Liters);
			Product tomato = new Product(3, "tomato", 30.00, Type.Kilograms);
			Product potato = new Product(4, "potato", 20.00, Type.Kilograms);
			Product grapes = new Product(5, "grapes", 50.00, Type.Kilograms);
			Product wheat = new Product(6, "wheat", 100.00, Type.Kilograms);

			List<Product> products = new ArrayList<>();
			products.add(milk);
			products.add(curd);
			products.add(tomato);
			products.add(potato);
			products.add(grapes);
			products.add(wheat);
			
			System.out.println("Enter the User Credentials .... \n");		/*the authorized user is only allowed to this        */

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the User Name : \n");
			String email = sc.next();
			System.out.println("Enter the Password : \n");
			String pass = sc.next();

			if (email.equalsIgnoreCase("srikanthneeli789@gmail.com") && pass.equalsIgnoreCase("srikanth"))
			{
				System.out.println("\t---------Welcome to store--------");
				
		
				Iterator<Product> itr = products.iterator();	/* Here all the products that are available in the store will be displayed to the customer */
				while (itr.hasNext())
				{
					System.out.println(itr.next());
				}
			}	
			else
			 {
				System.out.println("Invalid Credentials..!");			/* If an unauthorised person came it won't allow    */
		   	 }

				System.out.println("Enter the id to add the products in your  cart.. :");		
				
				 
				List<CustomerProductsDTO> customerList = new ArrayList<>();
				Double totalPrice = 0.0;
				/* The customer will demand the products that he/she wants, 
				    And the customer has to enter the ProductId's that they want and a;so need to mention the quantity of the product they want.
				    after entering the all the required products they want customer has to enter '100' to close the cart and start the billing   */
				while (true) {
					int input = sc.nextInt();
					if (input == 1) {
						System.out.println("Enter the Number of Liters of milk :");
						Double quantity = sc.nextDouble();
						totalPrice += quantity * milk.getPrice();
						customerList.add(new CustomerProductsDTO(1, "milk", Type.Liters, 60.00, quantity));
					}
					if (input == 2) {
						System.out.println("Enter the Number of Liters of curd :");
						Double quantity = sc.nextDouble();
						totalPrice += quantity * curd.getPrice();
						customerList.add(new CustomerProductsDTO(2, "curd", Type.Liters, 50.00, quantity));
					}
					if (input == 3) {
						System.out.println("Enter the how many kg's of tomato :");
						Double quantity = sc.nextDouble();
						totalPrice += quantity * tomato.getPrice();
						customerList.add(new CustomerProductsDTO(3, "tomato", Type.Kilograms, 30.00, quantity));
					}
					if (input == 4) {
						System.out.println("Enter the how many kg's of potato :");
						Double quantity = sc.nextDouble();
						totalPrice += quantity * potato.getPrice();
						customerList.add(new CustomerProductsDTO(4, "potato", Type.Kilograms, 20.00, quantity));
					}
					if (input == 5) {
						System.out.println("Enter the how many kg's of grapes :");
						Double quantity = sc.nextDouble();
						totalPrice += quantity * grapes.getPrice();
						customerList.add(new CustomerProductsDTO(5, "grapes", Type.Kilograms, 50.00, quantity));
					}
					if (input == 6) {
						System.out.println("Enter the how many kg's of wheat :");
						Double quantity = sc.nextDouble();
						totalPrice += quantity * wheat.getPrice();
						customerList.add(new CustomerProductsDTO(6, "wheat", Type.Kilograms, 100.00, quantity));
					}
					if (input == 100) {
						break;
					}
					System.out.println("To continue enter the listed products id to add in the cart..");
					System.out.println("Done with selection then enter 100 for exit...");

				}
				/* Using collections all the demanded productes are listed down in the console */

				System.out.println("The Products in Cart are ... ");
				Iterator<CustomerProductsDTO> customerListItr = customerList.iterator();
				while (customerListItr.hasNext()) {
					CustomerProductsDTO customerProduct = customerListItr.next();
					System.out.println(customerProduct);
				}
				/* All the products are listed and totaled the cost of the products to be paid to thew store*/
				System.out.println("TotalPrice of selected items : " + totalPrice);
			}

		}


	


