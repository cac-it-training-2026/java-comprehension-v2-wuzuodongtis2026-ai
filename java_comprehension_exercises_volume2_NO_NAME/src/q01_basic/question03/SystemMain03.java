package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する

		System.out.println("=== SystemMain03 実行開始 ===");

		// 構造方法なしで、Setterを利用し、値を送る
		Member member1 = new Member();
		member1.setName("高橋健太");
		member1.setAge(22);
		member1.setRank(3);
		System.out.println("Member 1 の情報:");
		member1.showMember();

		System.out.println("-------------------------");

		// 構造ありで直接値を送る
		Member member2 = new Member("渡辺直美", 28, 1);
		System.out.println("Member 2 の情報:");
		member2.showMember();

		System.out.println("=== SystemMain03 実行終了 ===");
	}
}
