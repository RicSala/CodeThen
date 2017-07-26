package library;

public class Author {
	private String name;
	private String dateOfBirth; //TODO change to Date type and implement change in other methods.
	private String cityofSpain;

	public Author(String name, String dateOfBirth, String cityofSpain) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.cityofSpain = cityofSpain;
	}

	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getCityofSpain() {
		return cityofSpain;
	}

	public void setCityofSpain(String cityofSpain) { //I allow this to change in case the Author decides to move...! ;)
		this.cityofSpain = cityofSpain;
	}

	@Override
	public String toString() {
		String authorDescription;
		authorDescription = name + ", currently living in " + cityofSpain + "%n";
		return authorDescription;
	}
}
