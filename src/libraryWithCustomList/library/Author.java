package library;

import java.util.Calendar;
import java.util.Date;

public class Author {
	private String name;
	private Date dateOfBirth;
	private String cityofSpain;

	public Author(String name, Date dateOfBirth, String cityofSpain) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.cityofSpain = cityofSpain;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
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
		authorDescription = name + ", currently living in " + cityofSpain + " | " + "  " + dateToString(dateOfBirth) + "%n";
		return authorDescription;
	}

	public String dateToString(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);  //TODO: Preguntar a Ferran, ¿Por qué se empeña en que nazca el día 10??? xD
		String niceDate = "Date of birth" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + +cal.get(Calendar.YEAR);

		return niceDate;
	}
}
