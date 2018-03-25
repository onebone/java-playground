public class Main {
	public static void main(String[] args) {
		get();
		// ^ get() 없애면 LazyHolder 클래스는 로드되지 않음
	}

	public static Main get() {
		return LazyHolder.instance;
	}

	private static class LazyHolder {
		public static final Main instance = new Main();

		static {
			System.out.println("init");
		}
	}
}
