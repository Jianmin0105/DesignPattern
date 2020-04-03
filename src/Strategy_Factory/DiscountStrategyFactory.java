package Strategy_Factory;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategyFactory {
	private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();
	static {
		strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
		strategies.put(OrderType.GROUP, new GroupDiscountStrategy());
		strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());		
	}
	public static DiscountStrategy getStrategy(OrderType orderType) {
		return strategies.get(orderType);
	}
}
