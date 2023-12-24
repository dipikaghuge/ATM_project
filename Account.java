package fbs.com.ClassAccount;

public class Account 
{
  private String actName;
  private int actNo;
  private int balance;
  private int actPin;
  
 public Account() {
	  }
  
public Account(String actName, int actNo, int balance, int actPin)
{
	super();
	this.actName = actName;
	this.actNo = actNo;
	this.balance = balance;
	this.actPin=actPin;

}

public String getActName() {
	return actName;
}

public void setActName(String actName) {
	this.actName = actName;
}

public int getActNo() {
	return actNo;
}

public void setActNo(int actNo) {
	this.actNo = actNo;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public int getActPin() {
	return actPin;
}

public void setActPin(int actPin) {
	this.actPin = actPin;
}


}
