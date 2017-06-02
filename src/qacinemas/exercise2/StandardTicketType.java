package qacinemas.exercise2;

public class StandardTicketType extends TicketDiscountType implements
		TicketType {

	public StandardTicketType( ) {
		loadModifier();
	}

	@Override
	public Object priceModifier() {
		return 0;
	}

	@Override
	public void loadModifier() {
	}

}
