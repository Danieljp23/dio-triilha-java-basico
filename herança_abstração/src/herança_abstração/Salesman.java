package herança_abstração;

public non-sealed class Salesman extends Enployee {

    private double soldAmount;
    public double getSoldAmount() {
        return soldAmount;
    }
    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    private double porcentual;

public Salesman(
            String code,
            String name,
            String adress,
            int age,
            double salary) {
        super(code, name, adress, age, salary);
        this.porcentual = porcentual;
        this.soldAmount = soldAmount;
    }
    @Override
public String getCode(){

return " SL" + super.getCode();
}


    public void setPorcentual(Double porcentual) {
        this.porcentual = porcentual;
    }

    public Double getPorcentual() {
        return porcentual;
    }

    @Override
	public double getFullSalary(){
		return this.salary+ ((soldAmount * porcentual)/100);
	}
}
