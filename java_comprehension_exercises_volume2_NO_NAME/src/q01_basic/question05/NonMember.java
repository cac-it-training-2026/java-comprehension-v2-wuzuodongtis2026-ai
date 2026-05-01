package q01_basic.question05;

public class NonMember extends AbstMember {

	public NonMember(String name) {
		this.name = name; // 将传入的名字赋值给父类的 protected 属性 name
	}

	@Override
	public void buyItem() {
		System.out.println(this.name + " purchased the item at a fixed price");
	}

	@Override
	public void showMember() {
		System.out.println(this.name + " is a non-member");
	}
}