import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time
{
	public static void main(String[] args)
	{
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before Formatting: " + myDateTime);

		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

		String formattedDate = myDateTime.format(timeFormat);
		System.out.println("After Formatting: " + formattedDate);
	}
}
