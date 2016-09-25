package Execption;

public class Calculations {
	
	public Double sumPositives(Double num1, Double num2) throws Exception{
		double sum = 0;
		if(num1>=0&&num2>=0){
			sum = num1 + num2;
		}else{
			throw new Exception("Problem! values must be positive.");
		}
		return sum;	
	}
	
	public Integer divide(int num1, int num2) throws Exception{
		int result =0;
		result = num1 / num2;		
		return result;
	}
	
	public static void main(String[] args) {
	
		Calculations c = new Calculations();
		try{
			System.out.println(c.sumPositives(32., 12.));
			System.out.println("Divide: "+c.divide(16, 0));
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Problems: "+ae.getMessage());
		}catch (Exception e) {
			System.out.println("General Errors: "+e.getMessage());
		}
	}	
}
