package MyPack;

class Balance {
	String name;
	double bal;

	Balance(String n, double b) {
		name = n;
		bal = b;
	}

	void show() {
		if (bal < 0)
			System.out.print("--->");
		System.out.println(name + ": $" + bal);
	}

	public static void main(String[] args) {
		Balance current = new Balance("Tom Jack", 157.02);
		current.show();
	}
}
