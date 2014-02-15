package pojo;

public class Child extends Student {
	public int getName(String ss) {
		return 2222;
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.getName();
	}
}
