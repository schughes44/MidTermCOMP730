package Question3InterfaceAbstract;

public class Brownie implements BakedGoods { 
	
	private int price;
	private String desc;
	private String sellBy;

	public Brownie(int price, String desc, String sellBy){
		this.price = price;
		this.desc = desc;
		this.sellBy = sellBy;
		
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return desc;
	}

	@Override
	public String getSellByDate() {
		return sellBy;
	}
	}
