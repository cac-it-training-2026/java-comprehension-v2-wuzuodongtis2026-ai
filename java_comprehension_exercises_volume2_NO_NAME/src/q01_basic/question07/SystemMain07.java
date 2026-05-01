package q01_basic.question07;

import java.util.Scanner;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");

		// Scannerを使ってユーザーの入力を受け取る
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();

		// 1から入力値までの数字をリストに追加して表示
		numberList.addFromOneTo(limit);
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの合計を計算します");

		// 合計を計算して変数 sum に代入
		int sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");

		// 各要素を2倍にして表示
		numberList.doubleListEachValue();
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");

		// 前半分を削除して表示
		numberList.removeIndexOfFirstHalf();
		System.out.println(numberList.getNumbers());

		// Scannerを閉じる
		scanner.close();
	}
}