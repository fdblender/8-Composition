//CompositionBasics.java
public class CompositionBasics {
	
	public static void main(String[] args) {
		String[] colleges = {"UMD", "UMBC", "Universities at Shady Grove", "MC", "McDaniels", "Frostburg", "Towson",
				"UMD Eastern Shore", "Mount St. Mary's", "Johns Hopkins University"};
		//Person bobby = new Person();
		//System.out.println(bobby.getSalary());
		
		
		Person bobby = new Person("Bobby Tenner", "Tester", 80L, 1, colleges);
		Person fran = new Person("Fran Dominique", "Programmer", 60, 1, colleges);
		Person dan  = new Person("Dan Zoo", "System Engineer", 50L, 1, colleges);
		Person sue = new Person("Sue Rant", "Manager", 80L, 1, colleges);
		System.out.println(bobby+"\n");
		System.out.println(fran+"\n");
		System.out.println(dan+"\n");
		System.out.println(sue+"\n");
	}
}