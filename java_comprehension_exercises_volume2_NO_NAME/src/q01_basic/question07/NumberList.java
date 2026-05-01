package q01_basic.question07;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 */
class NumberList {

	/**
	 * 整数のList
	 */
	private List<Integer> numbers = new ArrayList<>();

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */
	public void addFromOneTo(Integer limit) {
		// limitが0以下の場合、ループは実行されず空のままになります
		for (int i = 1; i <= limit; i++) {
			numbers.add(i);
		}
	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */
	public Integer calcSumOfList() {
		Integer sum = 0;
		// 拡張for文（foreach）を使って全要素を足し合わせる
		for (Integer num : numbers) {
			sum += num;
		}
		return sum;
	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	public void doubleListEachValue() {
		// インデックスを使って値を更新するため、通常のfor文を使用します
		for (int i = 0; i < numbers.size(); i++) {
			// 現在の値を取得し、2倍にして同じインデックスにセットし直す
			numbers.set(i, numbers.get(i) * 2);
		}
	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	public void removeIndexOfFirstHalf() {
		// 削除する個数を計算 (奇数の場合は切り捨てられるため、中央値は残ります)
		int removeCount = numbers.size() / 2;

		// 先頭の要素(インデックス0)を removeCount 回削除する
		for (int i = 0; i < removeCount; i++) {
			numbers.remove(0);
		}
	}

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
}