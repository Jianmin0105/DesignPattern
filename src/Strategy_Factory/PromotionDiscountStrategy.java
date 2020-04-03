package Strategy_Factory;

public class PromotionDiscountStrategy implements DiscountStrategy {

	@Override
	public double calDiscount(Order order) {
		// TODO Auto-generated method stub
		return order.val * 0.5;
	}

}
