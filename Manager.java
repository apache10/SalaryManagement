class Manager{

	private int totalMoney;
	private int salary;

	public void setsalary(int s){
		salary = s;
		setMoney();

	}

	public int getsalary(){
		return salary;
	}

	private void setMoney(int s){
		Money = salary / 3;
	}
	public int getMoney(){
		return Money;
	}
	
}