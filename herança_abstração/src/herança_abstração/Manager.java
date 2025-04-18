package herança_abstração;

public non-sealed  class Manager extends Enployee {

	private String login;
	
	private String password;
	
	private String adress;
	
	private double comission;

public Manager(String code,
String name,
String adress,
int age,
double salary,
String login, 
String password,
double comission)
{
	super(code, name, adress, age, salary);
	this.login = login;
	this.password = password;
	this.comission = comission;
}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(int comission) {
		this.comission = comission;
	}

	@Override
	public double getFullSalary(){
		return this.salary+ this.comission;
	}

	
}
