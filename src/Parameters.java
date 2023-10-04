import java.util.Random;

import org.testng.asserts.SoftAssert;

public class Parameters {
	static String url = "https://magento.softwaretestingboard.com/";

	static SoftAssert Check = new SoftAssert();

	static String[] firstnames = { "wasfy", "sarah","khaled", "mohamed","lana"};
	static Random first = new Random(); 
	static int randomFirstIndex = first.nextInt(firstnames.length);
	static String randomFirstName = firstnames[randomFirstIndex];
	
 
	static String[] lastnames = { "hadi", "wael","nader", "raed","sami"};
	static Random last = new Random();
	static int randomLastIndex = last.nextInt(lastnames.length);
	static String randomLastName = lastnames[randomLastIndex];
	
	
	
	static Random random = new Random();
	static int randomNum = random.nextInt(30000); 

	static String email_add = randomFirstName + randomLastName + randomNum + "@gmail.com";
	static String Pass =  randomFirstName +"_15"+randomLastName;
	
	
	
	public static void main(String[] args) {}
}
