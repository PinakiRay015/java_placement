package OOP;

public class gettersAndSetters {
    public static void main(String [] args)
    {
        bankAccount bankAccount = new bankAccount();
        bankAccount.setBankName("HDFC");
        bankAccount.setCurBal(120000);
        System.out.println("The name of the bank is "+bankAccount.getBankName());
        System.out.println("The current balance of the bank is "+bankAccount.getCurBal());
    }
}

class bankAccount
{
     private int curBal;
     private String bankName;

    public int getCurBal() {
        return curBal;
    }

    public void setCurBal(int curBal) {
        this.curBal = curBal;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
