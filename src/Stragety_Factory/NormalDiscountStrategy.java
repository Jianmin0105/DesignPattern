package src.Stragety_Factory;

public class NormalDiscountStrategy implements DiscountStrategy {

	@Override
	public double calDiscount(Order order) {
		// TODO Auto-generated method stub
		return order.val;
	}

}
