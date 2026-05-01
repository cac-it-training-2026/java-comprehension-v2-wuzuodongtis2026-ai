package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;

		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		// TODO ここから実装する
		try {
			System.out.print("Please input ID (number) >> ");
			inputId = cr.inputNumber();

			System.out.print("Please input Password >> ");
			inputPassword = cr.inputString();

			Member member = new Member(inputId, inputPassword, name, age, rank);

			// 4. 显示会员信息
			System.out.println("\n---MEMBER INFO---");
			member.showMember();

		} catch (NumberFormatException e) {
			System.out.println("エラー：IDには数値を入力してください。 (Error: ID must be a number)");
		} catch (IOException e) {
			System.out.println("エラー：入出力エラーが発生しました。 (Error: I/O error occurred)");
		}

	}

}