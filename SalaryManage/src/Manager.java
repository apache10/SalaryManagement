/**
 * Created by gaurav on 20-08-2016.
 */class Manager{

    private int Money;
    private int salary;

    public void setsalary(int s){
        salary = s;
        setMoney(salary);
    }

    public int getsalary(){
        return salary;
    }

    private void setMoney(int s){
        Money = s / 3;
    }
    public int getMoney(){
        return Money;
    }

}
