
public class Education {
	private String[] schools;
	private static int NO_OF_SCHOOLS = 10;

	public Education(String[] schoolArray) {
		this.schools = new String[NO_OF_SCHOOLS];
		for (int i = 0; i < schoolArray.length; i++) {
			this.schools[i] = schoolArray[i];
		}
	}

	public String[] getSchools() {
		return (this.schools);
	}

	public String toString() {
		String schoolsStr = "Schools: ";
		for (int i = 0; i < this.schools.length; i++) {
			if (this.schools[i] != null) {
				schoolsStr += this.schools[i] + ", ";
			}
		}
		return (schoolsStr);
	}

}
