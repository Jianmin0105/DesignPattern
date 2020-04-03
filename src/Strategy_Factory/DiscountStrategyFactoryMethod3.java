package Strategy_Factory;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategyFactoryMethod3 {
	// each time produce a new object to customer
	// store Class in map, use reflection to generate new object
	private Map<OrderType, Class<?>> strategies;
	private DiscountStrategyFactoryMethod3() {
		strategies = new HashMap<>();
		try {
			strategies.put(OrderType.NORMAL, Class.forName("NormalDiscountStrategy"));
			strategies.put(OrderType.GROUP, Class.forName("GrouplDiscountStrategy"));
			strategies.put(OrderType.PROMOTION, Class.forName("PromotionDiscountStrategy"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static class Holder {
		private static final DiscountStrategyFactoryMethod3 instance = new DiscountStrategyFactoryMethod3();
	}
	public static DiscountStrategyFactoryMethod3 getInstance() {
		return Holder.instance;
	}
	public DiscountStrategy getType(OrderType orderType) {
		try {
			return (DiscountStrategy) strategies.get(orderType).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
