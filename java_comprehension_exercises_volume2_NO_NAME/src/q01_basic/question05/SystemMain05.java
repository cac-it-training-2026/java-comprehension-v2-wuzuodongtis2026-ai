package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		// TODO ここから実装する
		members[0] = new Member(101, "mypass123", "Alice", 25, 1);

		members[1] = new NonMember("Bob");

		for (AbstMember member : members) {
			member.showMember();
			member.buyItem();
			System.out.println("--------------------");
		}

	}
}