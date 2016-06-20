//Person.java
public class Person {
	// composition has-a relationship
	private String name;
	private Job job;
	private Education education;

	public Person(String name, String role, long salary, int id, String[] schools) {
		this.name = name;
		this.job = new Job(role, salary, id);
		job.setSalary(1000L);
		this.education = new Education(schools);
	}

	public long getSalary() {
		return job.getSalary();
	}
	
	public String toString() {	
		return(this.name + ": "+this.job+"\n"+this.education);
	}
}
