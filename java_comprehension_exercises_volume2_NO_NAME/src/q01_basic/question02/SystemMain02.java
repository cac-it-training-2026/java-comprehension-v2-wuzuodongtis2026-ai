package q01_basic.question02;

/**
 * 系统的主要执行类
 */
public class SystemMain02 {
	public static void main(String[] args) {
		System.out.println("---SHOW DATA---");

		// 创建一个 Member 实例
		Member member = new Member();

		// 赋予初始值 (注意：这里变成了调用 set 方法)
		member.setName("Miura Manabu");
		member.setAge(24);
		member.setRank(1);

		// 显示信息
		member.showMember();

		// 测试升级功能
		System.out.println("\n---RANK UP 发生！---");
		member.rankUp(); // 调用升级方法

		// 再次显示信息，你会发现 rank 变成了 2
		member.showMember();
	}
}