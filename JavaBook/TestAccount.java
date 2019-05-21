class Account {
	private String NO;
	private String pwd;
	private float money;

	private Account(String NO, String pwd, float money) {
		this.NO = NO;
		this.pwd = pwd;
		this.money = money;
	}

	public void save(float value) {
		money += value;
	}

	public boolean fetch(float value) {
		boolean bSuccess = false;
		if(money >= value) {
			money -= value;
			bSuccess = true;
		}
		return bSuccess;
	}
}

public class TestAccount {
	public static void main(String[] args) {
		Account zhang = new Account("zhang","111",100);
		zhang.save(100);
		System.out.println("zhang enter 100");
		if(zhang.fetch(150.0f)) {
			System.out.println("zhang take 150");
		}
	}
}
