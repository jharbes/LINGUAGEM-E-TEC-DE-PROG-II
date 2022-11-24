package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + this.getAdditionalCharge() * 1.1;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public String toString() {
		return super.toString() + "OutsourcedEmployee [additionalCharge=" + additionalCharge + "]";
	}

}
