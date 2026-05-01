package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会员情報を表示します===");

		// TODO ここから実装する
		// 创建一个带参数的 Member 对象进行展示
		Member member = new Member(999, "secret_pw", "山田太郎", 28, 1);

		member.showMember();
	}
}