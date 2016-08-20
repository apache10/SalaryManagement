/**
 * Created by gaurav on 20-08-2016.
 */class Manager{

    private double Money;
    private double salary;
    private String name;
public Manager(){
    setMoney();
    setname();}
    public void setsalary(double s){
        salary = s;
        setMoney();
    }

    public double getsalary(){
        return salary;
    }

    public void setname(){
        name = Constant.CEO_NAME;
    }
    public String getname(){
        return name;
    }

    public void setMoney(){
        Money = salary / 3;
    }
    public double getMoney(){
        return Money;
    }

}
