package Question2UnitTest;

public class InventoryItem {
	private String type;
	private int weight;
	private String name;
	private int count; 
	// 1 if a single item; more if multiplepublic InventoryItem(String t, int w,
	// String n, int countOfItems) {type = t;weight = w;name = n;
	
	public InventoryItem(String t, int w, String n, int countOfItems) {
		type = t;
		weight = w;
		name = n;
		count = countOfItems;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		String ret = name + " type (" + type + "), wt: " + weight;
		if (count > 1) {
			ret += ", there are " + count + " left";
		}
		return ret;
		//changed variable to return ret instead of name
	}
}
