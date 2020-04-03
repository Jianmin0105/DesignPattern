package src.Stragety_Factory;

public class GroupDiscountStrategy implements DiscountStrategy {

	@Override
	public double calDiscount(Order order) {
		// TODO Auto-generated method stub
		return order.val * 0.8;
	}

}
