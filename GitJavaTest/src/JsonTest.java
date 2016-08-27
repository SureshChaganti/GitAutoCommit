
public class JsonTest {

	public static void main(String[] args) {

		String Json="{\"batters\": {\"batter\": [ { \"company_id\": \"1001\", \"type\": \"Regular\" }, { \"id\": \"1002\", \"type\": \"Chocolate\" },{ \"id\": \"1003\", \"type\": \"Blueberry\" },{ \"id\": \"1004\", \"type\": \"Devil's Food\" } ]	}}\"";
		
		String singleCOmplexObject="{\"batters\": {\"batter\": [ { \"company_id\": \"1001\", \"type\": \"Regular\" }\"]\"}\"}\"";
				
				//"{ \"access_point\":\"%s\",\"company_id\":\"%d\",\"ipd_campaign\":\"%s\"}","Left_nav",i,"payroll_campaign"
		
		
		int i =200;
		String format = //String.format("{ \"access_point\":\"%s\",\"batter\":  { \"company_id\": \"5125253\", \"type\": \"Regular\"},\"company_id\":\"%d\",\"ipd_campaign\":\"%s\",\"Left_nav\",5125253,\"payroll_campaign\"}");
		//String.format("{ \"access_point\":\"%s\",\"company_id\":\"%d\",\"ipd_campaign\":\"%s\",\"batter\":  { \"company_id\": \"5125253\", \"type\": \"Regular\"}}","Left_nav",i,"payroll_campaign");
		//		String.format("{ \"access_point\":\"%s\",\"company_id\":\"%d\",\"ipd_campaign\":\"%s\",\"batter\":  { \"company_id\": \"%d\", \"type\": \"Regular\"}}","Left_nav",i,"payroll_campaign",i);
				//String.format("{\"batters\":{\"batter\":[{ \"company_id\": \"%d\", \"type\": \"Regular\" }]},\"topping\":[{ \"id\": \"5004\", \"type\": \"Maple\" }]}",i);
				
				//String.format("{ \"access_point\":\"%s\",\"company_id\":\"%d\",\"ipd_campaign\":\"%s\",\"batters\":{\"batter\":{ \"company_id\": \"%d\", \"type\": \"Regular\" }},\"topping\":{ \"id\": \"5004\", \"type\": \"Maple\" }}}","Left_nav",i,"payroll_campaign",i);
			//	String.format("{ \"access_point\":\"%s\",\"company_id\":\"%d\",\"ipd_campaign\":\"%s\",\"batters\":{\"batter\":{ \"company_id\": \"%d\", \"type\": \"Regular\" }},\"topping\":{ \"company_id\": \"%d\", \"type\": \"Maple\" }}","Left_nav",i,"payroll_campaign",i,i);
		String.format("{ \"access_point\":\"%s\",\"company_id\":\"%d\",\"ipd_campaign\":\"%s\",\"batters\":{\"batter\":{ \"company_id\": \"%d\", \"type\": \"Regular\" },\"topping\":{ \"company_id\": \"%d\", \"type\": \"Maple\" }}}","Left_nav",i,"payroll_campaign",i,i);
		
		
		
		System.out.println(format);

	}

}
