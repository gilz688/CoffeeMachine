public enum Selection {
	BLACK("black",35), WHITE("white",35), SWEET("sweet",35), BOTH("both",35), BOULLION("boullion",25);
	
	private Selection(String pText, int pPrice){
		text = pText;
		price = pPrice;
	}
	
	public int priceOf(){
		return price;
	}

	@Override
	public String toString() {
		return text;
	}
	
	private String text;
	private int price;
}
