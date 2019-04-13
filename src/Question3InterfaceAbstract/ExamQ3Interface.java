package Question3InterfaceAbstract;

import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {
	public static void main(String[] args) {
		
		Cookie cookie = new Cookie(2, "Cookie", "Today");
		CinnamonRoll cinn = new CinnamonRoll(3, "Cinnamon Roll", "Today" );
		Brownie brownie = new Brownie(1, "Brownie", "Today");
		
		List<BakedGoods> BakedGoodsList = new ArrayList<BakedGoods>();
		BakedGoodsList.add(cookie);
		BakedGoodsList.add(cinn);
		BakedGoodsList.add(brownie);
		
		for(BakedGoods b : BakedGoodsList ) {
			System.out.println("Price: " + b.getPrice() + "\n" + "Description: " + b.getDescription() + "\n" +"Sell by: " + b.getSellByDate());
		}
	}
}