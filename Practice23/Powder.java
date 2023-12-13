package Practice23;

public class Powder implements InterfaceWeight {
	private String color;
	private double weight;

	public Powder() {
		super();
	}

	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void getWeightMethod() {
		System.out.println("天秤" + this.getWeight());
	}

}
