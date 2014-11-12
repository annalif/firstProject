
public class ComplexityCalculator {
	
	public String taskOperation;
	public int complexity;

	public ComplexityCalculator(String taskOperation) {
		this.taskOperation = taskOperation;
		complexity = calc();
	}
	
	public int calc(){
		
		// Calculation for WebPage
		if ( taskOperation.equalsIgnoreCase("web page")){
			return 3;
		} else {
			return 0;		
		}
	}

	public static void main(String[] args) {
		System.out.println("Git is fun");
    }
}	
