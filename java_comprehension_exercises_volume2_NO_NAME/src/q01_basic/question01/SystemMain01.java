package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************



/**
 * システム実行
 */
public class SystemMain01 {
	public static void main(String[] args) {
		System.out.println("---SHOW DATA---");

		Member member = new Member();

		member.name = "Miura Manabu";
		member.age = 24;
		member.rank = 1;

		member.showMember();

		member.name = "Sato Kensuke";
		member.age = 36;
		member.rank = 2;

		member.showMember();
	}
}
