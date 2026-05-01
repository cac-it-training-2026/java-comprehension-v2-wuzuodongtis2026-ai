package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */

	public static void showAllMembers(Member[] members) {
		for (int i = 0; i < members.length; i++) {

			members[i].showMember();
		}
	}
}