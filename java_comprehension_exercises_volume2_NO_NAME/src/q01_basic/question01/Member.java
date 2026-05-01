package q01_basic.question01;

/**
 * Member 会員クラス
 */

public class Member {
	public String name;
	public int age;
	public int rank;

	public void showMember() {

		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}