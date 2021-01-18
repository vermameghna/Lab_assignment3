package labAssignment3;

public class Invoice implements Payable{
	private String partnum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice() {
	}

	public Invoice(String partnum, String partDescription, int quantity, double pricePerItem) {
		this.partnum = partnum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartnum() {
		return partnum;
	}

	public void setPartnum(String partnum) {
		this.partnum = partnum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [partnum=").append(partnum)
				.append(", partDescription=").append(partDescription)
				.append(", quantity=").append(quantity)
				.append(", pricePerItem=").append(pricePerItem).append("]");
		return builder.toString();
	}
	
	@Override
	public double getPayment() {
		System.out.println(this.toString());
		return quantity*pricePerItem;
	}
	
	

}
