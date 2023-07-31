package com.edwin.hiberanate.HibernateTask;

import com.edwin.hiberanate.HibernateTask.entity.Product;

public class MenuFunctions {
	
	void createProduct() {
		Product newProduct = new Product();
		newProduct.setProductId(ReadUtils.readInt("Enter Product ID:"));
		newProduct.setProductName(ReadUtils.readString("Enter Product Name: "));
		newProduct.setProductPrice(ReadUtils.readDouble("Enter Product Price: "));
		newProduct.setQuantity(ReadUtils.readInt("Enter Quantity"));
		newProduct.setProductTax(ReadUtils.readDouble("Read Product Tax"));
		newProduct.setTotalPrice((newProduct.getProductTax()+newProduct.getProductPrice())*newProduct.getQuantity());
		CRUDProduct.insertProduct(newProduct);
	}
	void readProduct() {
		int newPid = ReadUtils.readInt("Enter Product Id to be Read: ");
		Product newP = CRUDProduct.readProdcuct(newPid);
		if(newP==null) {
			System.out.println("Product not found");
			return;
		}
		System.out.println(newP);
		
	}
	void updateProduct() {
		int newPid = ReadUtils.readInt("Enter Product Id to be updated: ");
		Product newP = CRUDProduct.readProdcuct(newPid);
		System.out.println("Which field do you want to edit?\n1.Name\n2.Price\n3.Quantity\n4.Product Tax");
		int selection = ReadUtils.readInt("Select (1-5)");
		switch(selection) {
		case 1:newP.setProductName(ReadUtils.readString("Enter new name")); break;
		case 2:newP.setProductPrice(ReadUtils.readDouble("Enter new name")); break;
		case 3:newP.setQuantity(ReadUtils.readInt("Enter new Quantity")); break;
		case 4:newP.setProductTax(ReadUtils.readDouble("Enter new Tax")); break;
		}
		newP.setTotalPrice((newP.getProductTax()+newP.getProductPrice())*newP.getQuantity());
		CRUDProduct.updateProduct(newP);
		
	}
	
	void deleteProduct() {
		int newPid = ReadUtils.readInt("Enter Product Id to be deleted: ");
		Product newP = CRUDProduct.readProdcuct(newPid);
		if(newP==null) {
			System.out.println("Product not found");
			return;
		}
		System.out.println("The Following Product is getting deleted: \n"+newP);
		CRUDProduct.deleteProduct(newPid);
		
	}

}
