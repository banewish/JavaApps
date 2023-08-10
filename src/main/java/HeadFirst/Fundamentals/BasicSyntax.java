package HeadFirst.Fundamentals;

public class BasicSyntax {

	public static void main(String[] args) {
		String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", 
		"web-based", "persavive", "smart", "six-sigma", "critical-path", "dynamic", "static"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
		"clustered"};
		String[] wordListThree = {"process", "tipping-point", "OOP", "functional programming", "solution", 
		"architecture"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		System.out.println(oneLength);
		
		int random1 = (int) (Math.random() * oneLength);
		int random2 = (int) (Math.random() * twoLength);
		int random3 = (int) (Math.random() * threeLength);
		System.out.println(random3);	
			 		
				
		}
	
}
