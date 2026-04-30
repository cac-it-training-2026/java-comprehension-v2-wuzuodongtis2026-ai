package q01_basic.question02;

/**
 * 系统的主要执行类
 */
public class SystemMain02 {
	public static void main(String[] args) {
		System.out.println("---SHOW DATA---");

		Member member = new Member();

		member.setName("Miura Manabu");
		member.setAge(24);
		member.setRank(1);

		member.showMember();

		System.out.println("\n---RANK UP 发生！---");
		member.rankUp();

		member.showMember();
	}
}