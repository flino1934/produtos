package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ManuFatured extends Product{
	
	final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public ManuFatured() {
		
	}

	public ManuFatured(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Name: "+getName()+" (USED)"
		+"\nPrice: "+getPrice()+" R$"
		+"\nManufactured Date: "+sdf.format(manufactureDate);
	}

	
	
}
