package qacinemas.exercise2;

public abstract class TicketDiscountType {

	private double percent;
	private double arithmetic;

	public TicketDiscountType() {
	}

	public static double apply(double percent, double basicArithmetic,
			double cost) {
		double result = cost;
		if (percent != 0.0f) {
			result *= percent;
		}
		if (basicArithmetic != 0.0f) {
			result += basicArithmetic;
		}
		return result;
	}

	public double apply(double cost) {
		double result = cost;

		if (getPercent() != 0.0) {
			result *= getPercent();
		}
		if (getArithmetic() != 0.0) {
			result += getArithmetic();
		}
		return result;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public double getArithmetic() {
		return arithmetic;
	}

	public void setArithmetic(double arithmetic) {
		this.arithmetic = arithmetic;
	}

}