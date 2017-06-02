package qacinemas.exercise2;

public class WednesdayDiscountTicket extends TicketDiscountType implements
		TicketType {

	public WednesdayDiscountTicket() {
		loadModifier();
	}

	@Override
	public void loadModifier() {
		setArithmetic((double) priceModifier());
		System.out.println("Set arithmetic to: " + getArithmetic());
	}

	@Override
	public Object priceModifier() {
		return (double) -2.00;
	}

}
