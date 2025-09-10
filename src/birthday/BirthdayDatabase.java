package birthday;

import java.util.Date;
import java.util.List;

public interface BirthdayDatabase {

	List<String> findBirthdays(Date date);

	String password = "12345";

	String ssn = "123-45-7894"
}
