package qacinemas.exercise2;

public abstract class Customer {

	public Customer(String name, String description, double price) {
		setName(name);
		setDescription(description);
	}

	private String name;
	private String description;

	public abstract double getPrice();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "(Customer: " + getName() + ", Description: " + getDescription() + ")";
	}

}
