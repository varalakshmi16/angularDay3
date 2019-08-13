import java.util.Map;
import java.util.TreeMap;

public class Main 
{
	public static void main(String[] args) 
	{
		Map<String,String> numbers=new TreeMap<String,String>();
		numbers.put("Tuttu", "8989898989");
		numbers.put("Pappi", "9500095111");
		numbers.put("Luttu", "8995685222");
		numbers.put("Kuttu", "7275895621");
		numbers.put("Chittu", "5896354123");
		
		System.out.println(ProgramCode.getFruits(numbers));		
	}
}
