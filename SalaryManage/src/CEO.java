/**
 * Created by gaurav on 20-08-2016.
 */ class CEO{
    private double money;
    private double salary;
    private String name;


    public  CEO(){
        setmoney();
        setname();
    }

    public void setmoney(){
        money = Constant.REVENU;
        setsalary();
    }

    public double getmoney(){
        return money*0.9;

    }
    public void setname(){
        name = Constant.CEO_NAME;
    }
    public String getname(){
        return name;
    }

    public void setsalary(){
        salary = money / 10;
    }

    public double getsalary(){
        return salary;
    }

}
