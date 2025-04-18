package herança_abstração;

public sealed abstract class Enployee permits Manager, Salesman {

	protected String name;

	protected String code;

	protected String adress;

	protected Double salary;

	protected int age;

	public Enployee(String code, String name, String adress, int age, double salary) {
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public abstract double getFullSalary();

}
