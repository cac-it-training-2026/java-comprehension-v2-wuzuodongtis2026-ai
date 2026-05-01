package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {
		// 创建会员列表
		List<Member> members = new ArrayList<>();
		members.add(Member.getInstance(1, "pass123", "山田太郎", 30, 2));
		members.add(Member.getInstance(2, "pass456", "佐藤花子", 25, 3));

		System.out.println("=== 会員情報を表示します ===");
		MemberManager.showAllMembers(members);

		System.out.println("\n=== ID:2 のパスワードを更新します ===");
		MemberManager.updatePassword(members, 2, "new_password_789");

		System.out.println("\n=== 更新後の会員情報を表示します ===");
		MemberManager.showAllMembers(members);

		System.out.println("\n=== 存在しないID:99 のパスワードを更新します ===");
		MemberManager.updatePassword(members, 99, "error_pass");
	}
}