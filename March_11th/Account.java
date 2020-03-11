package March_11th;

public class Account {
    /**
     * ### A.写一个名为Account的类模拟账户。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
     *
     * 包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。 提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。
     */
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int id, double balance,double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void deposit(double d ){
        this.balance+=d;
        System.out.println("成功存款："+d+"元");
    }
    public void withdraw(double d){
        if(d>balance){
            System.out.println("余额不足，取款失败");
        }else{
            System.out.println("成功取款："+d+"元");
            System.out.println("账户余额为："+(this.balance-d));
            this.balance -= d;
        }
    }
}
