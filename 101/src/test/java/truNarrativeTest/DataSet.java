package truNarrativeTest;


	import java.util.LinkedHashMap;
	import java.util.Map;

	public class DataSet {

		private static Map<String,String> DataSet=new LinkedHashMap<String,String>();
		

		public static  Map<String,String> getDataSet()
		{
			DataSet.put("John Lord","Founder & CEO");  
			DataSet.put("David Eastaugh","Chief Technology Officer");  
			DataSet.put("Nicola Janney","Human Resources Manager");
			DataSet.put("Ryan Morrison","Head of Direct & Marketing");
			DataSet.put("Mike Harriss" , "Head of Commercial Channels");
			DataSet.put("Kathy Clark" ,	"Director of Global Human Resources");
			DataSet.put("Jonathan Kent" , "Financial Director");
			DataSet.put("Kerri Antles", "Group Chief Financial Officer");
			return DataSet;  
			
			  
		}
	}


