package test1;

public class RunTest {

	public static void main(String[] args) throws Exception {
		
		AmazonWeb a = new AmazonWeb();
		AmazonMob m = new AmazonMob();
		CommonFunctions c = new CommonFunctions();
		
		
		a.amazonWebTest();
		c.sleep(5);			
		m.amazonMobTest();		
	}
}
