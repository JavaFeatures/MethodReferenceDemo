package demo;

public class Fruit {
	
	private String name;
	private int calorieCount;
	
	public Fruit(String name) {
		super();
		this.name = name;
		this.calorieCount = 0;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCalorieCount() {
		return calorieCount;
	}
	
	public void setCalorieCount(int calorieCount) {
		this.calorieCount = calorieCount;
	}

}
