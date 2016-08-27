import java.util.ArrayList;

public class mathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=sqrtFinder(-300,10000);
		for (int i = 0; i < al.size(); i++) {
		
			Double d = (Double) al.get(i);
			int s = (int)d.doubleValue();
			System.out.println(s);
		}

	}

	public static ArrayList sqrtFinder(int a, int b) {
		ArrayList list = new ArrayList();
		for(double i=a; i<=b ;i++ ){
			
			double s= Math.sqrt(i);
			
			if(s%Math.ceil(s)==0){
				
				list.add(s);
			}
			
		}
		
		
		
		return list;
	}

}
