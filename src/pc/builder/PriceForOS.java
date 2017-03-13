package pc.builder;


public enum PriceForOS {
	Microsoft_Windows_7_Home_Premium_32_64_bit(88.58),
	Microsoft_Windows_7_Home_Premium_SP1_32_bit(179.00),
	Microsoft_Windows_7_Home_Premium_SP1_64_bit(99.99),
	Microsoft_Windows_8_32_bit(94.98),
	Microsoft_Windows_8_64_bit(99.98),
	Microsoft_Windows_8_1_32_64_bit(119.98),
	Microsoft_Windows_8_1_32_bit(95.88),
	Microsoft_Windows_8_1_64_bit(89.88),
	Microsoft_Windows_10_Home_32_64_bit(119.99),
	Microsoft_Windows_10_Home_32_bit(89.89),
	Microsoft_Windows_10_Home_64_bit(88.58);
	
	private double price;
	
	private PriceForOS(double price){
		this.price = price;
	}

	public String getPrice() {
		return "Price: $" + price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
