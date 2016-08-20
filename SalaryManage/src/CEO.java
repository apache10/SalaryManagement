/**
 * Created by gaurav on 20-08-2016.
 */ class CEO{
    private int money;
    private int salary;

    public void setmoney(int m){
        money = m;
        setsalary();
    }

    public int getmoney(){
        return money;

    }

    private void setsalary(){
        salary = money / 10;
    }

    public int getsalary(){
        return salary;
    }

}
