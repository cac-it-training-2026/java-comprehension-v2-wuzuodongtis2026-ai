package q01_basic.question03;

class Member {
	//TODO ここから実装する
	//  プライベート属性を定義する
	private String name;
	private int age;
	private int rank;

	//  本来の構造方法
	public Member() {
	}

	//  数値ある構造方法
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	// 4. Getter とSetterの方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// メンバーを表す方法
	public void showMember() {
		System.out.println("名前: " + name + ", 年齢: " + age + ", ランク: " + rank);
	}
}
