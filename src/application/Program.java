package application;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import entities.ImportedProduct;
import entities.ManuFatured;
import entities.Product;

public class Program {

	public static void main(String[] args) throws HeadlessException, ParseException {
		// TODO Auto-generated method stub

		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of product"));
		List<Product> products = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {

			String name = JOptionPane.showInputDialog("Enter the product name: ");
			double price = Integer.parseInt(JOptionPane.showInputDialog("Price: "));
			
			String[] select = { "Imported", "Manufactured" };
			String type = (String) JOptionPane.showInputDialog(null, "Type ", "Type of product",
					JOptionPane.QUESTION_MESSAGE, null, select, select[0]);
			//Vai selecionar o tipo de produto que �

			if (type.equals("Imported")) {
				
				double customFee = Double.parseDouble(JOptionPane.showInputDialog("enter customs duty amount"));
				Product imported = new ImportedProduct(name, price, customFee);
				products.add(imported);
				//O if vai verificar se � uma classe ImportedProduct lembrando que a classe ImportedProduct � uma Product
				
			} else if (type.equals("Manufactured")) {
				
				Date manufactureDate = sdf.parse(JOptionPane.showInputDialog("Enter date of manufacture"));
				Product manufacture = new ManuFatured(name, price, manufactureDate);
				products.add(manufacture);
				//O if vai verificar se � uma classe ManuFacturedProduct lembrando que a classe ManufacturedProduct � uma Product
			}

		}

		System.out.println("Price Tags");
		for (Product product : products) {

			System.out.println(product);
			System.out.println();

		}

	}

}
