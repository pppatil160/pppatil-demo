package SecondProject;

public class pratik {
	 public static void main(String[] args) {
			String org = "Pratik";
			String rev = "";
			
			for(int i=org.length()-1; i>=0;i--) {
				
				rev = rev+org.charAt(i);
				
			}
			System.out.println("Orignal String = "+org);
			System.out.println("Rserse String = "+ rev);
		}
}
