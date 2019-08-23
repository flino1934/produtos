package entities;

public class ImportedProduct extends Product {

	private Double customFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}
	
	public Double totalPrice() {
		
		return getPrice()+customFee;
		
	}
	
	@Override
	public String toString() {
		return "Name: "+getName()
		+"\nPrice: "+getPrice()
		+"\nCustom fee: "+customFee;
	}

}
