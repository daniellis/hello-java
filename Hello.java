public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello");

    System.out.format("%s is even? %s\n", "3", isEven(3));
    System.out.format("%s is even? %s\n", "4", isEven(4));
    System.out.format("%s is even? %s\n", "5", isEven(5));
    System.out.format("%s is even? %s\n", "6", isEven(6));

  }

  public static String isEven(int num) {
    return String.valueOf(num % 2 == 0);
  }
}
