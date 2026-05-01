package q01_basic.question06;

class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	@Override
	public void showMember() {
		System.out.println("ID: " + id);
		System.out.println("Password: " + password);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Rank: " + rank);
	}

	@Override
	public void buyItem() {
		System.out.println(name + " purchased an item.");
	}
}