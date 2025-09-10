package birthday;

import java.util.Date;
import java.util.List;

public interface BirthdayDatabase {

	List<String> findBirthdays(Date date);

	String ssn = "123-45-6789"
}
