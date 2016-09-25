package Constants;

public class Teacher {

	private static final String JAVA = "Chris";
	private static final String DB = "Vivian";
	private static final String BI = "July";

	public final static void showTeacher(){
		System.out.println("Java: "+JAVA);
		System.out.println("Data Base: "+DB);
		System.out.println("BI: "+BI);
	}
	
	public static String getJava() {
		return JAVA;
	}

	public static String getDb() {
		return DB;
	}

	public static String getBi() {
		return BI;
	}

	public static void main(String[] args) {
		Teacher.showTeacher();
		System.out.println();
		System.out.println("DB: "+Teacher.DB);
	}
	
}
