package src.Stragety_Factory;
import java.util.*;

public class DiscountStrategyFactoryMethod2 {
	private Map<OrderType, DiscountStrategy> strategies;
	private DiscountStrategyFactoryMethod2 {
		strategies = new HashMap<>();
		strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
		strategies.put(OrderType.GROUP, new GroupDiscountStrategy());
		strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
	}
	private static class Holder {
		private static final DiscountStrategyFactoryMethod2 instance = new DiscountStrategyFactoryMethod2();
	}
	public static DiscountStrategyFactoryMethod2 getInstance() {
		return Holder.instance;
	}
	public DiscountStrategy getType(OrderType orderType) {
		return strategies.get(orderType);
	}
}
