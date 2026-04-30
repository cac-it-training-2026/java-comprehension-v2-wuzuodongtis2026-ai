package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];

		members[0] = new Member(101, "pass123", "佐藤", 25, 2);

		members[1] = new Member();
		members[1].setId(102);
		members[1].setPassword("abc888");
		members[1].setName("铃木");
		members[1].setAge(30);
		members[1].setRank(1);

		System.out.println("--- 登録されている全メンバー ---");
		MemberManager.showAllMembers(members);

	}

}