package sample;

public class Dog extends AnimalObjectEx {
	public static String OWNER = "ABC";
	public static boolean isTodayDogDay;
	private int numberOfLegs;
	String breed;
	int age;

	static {
		int r = 0;
		// read table that has yearly significant days. Initialize
		// isTodayDogDay.
	}

	public Dog() {

		super();
	}
	
	public Dog(String breed) {
		this.breed = breed;

		//super();
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public boolean getEligibilityForComptn() {
		return age > 2;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public void move() {
		int jj = super.h;
		System.out.println("Dog runs");
		System.out.println(OWNER);
		setNumberOfLegs(6);

		int j = 7;
		setNumberOfLegs(j);
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.move();
		d.age = 3;
		 
		
		Dog d2 = new Dog("Doberman");
		
		
		System.out.println(OWNER);
		AnimalObjectEx animal = new AnimalObjectEx();
		 

		AnimalObjectEx animal_dog = new Dog();
		animal_dog.getName();
		
		
		Dog dog = new Dog();
		int n = dog.getNumberOfLegs();
		
		
	}
}
