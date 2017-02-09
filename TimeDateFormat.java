import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Java date format legend:

G Era designation      Text               AD
y Year                 Year               1996; 96
M Month in year        Month              July; Jul; 07
w Week in year         Number             27
W Week in month        Number             2
D Day in year          Number             189
d Day in month         Number             10
F Day of week in month Number             2
E Day in week          Text               Tuesday; Tue
a Am/pm marker         Text               PM
H Hour in day (0-23)   Number             0
k Hour in day (1-24)   Number             24
K Hour in am/pm (0-11) Number             0
h Hour in am/pm (1-12) Number             12
m Minute in hour       Number             30
s Second in minute     Number             55
S Millisecond          Number             978
z Time zone            General time zone  Pacific Standard Time; PST; GMT-08:00
Z Time zone            RFC 822 time zone  -0800
 * 
 *
 */
public class TimeDateFormat {

	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(new java.text.SimpleDateFormat("MM/dd/yyyy h:mm:ss S").format(new Date()));
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		System.out.println(endTime);
		System.out.println(endTime);
		
		System.out.println("That took " + (endTime - startTime) + " nanoseconds");
		
		for (int i = 0; i <= 100; i++) {
			list.add(i, i);
			//System.out.print(i);
		}
		String timestamp1 = 
			    new java.text.SimpleDateFormat("MM/dd/yyyy h:mm:ss S").format(new Date());
		System.out.println(timestamp1);
	}
	
}
