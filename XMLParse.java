import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class XMLParse {
	public static Collection<Integer> getIdsByMessage (String xml, String message) throws Exception {
//		List<Integer> output = new ArrayList<Integer>();
//		//String this_xml = xml;
//		String subString = xml;
//		String searchString_end = "\">\n" + 
//                "        <message>" + message + "</message>\n";
//		
//		String searchString_begin = "    <entry id=\"";
//		
//		Integer index_end = 0;
//		Integer index_begin = 0;
//		
//		index_end = subString.indexOf(searchString_end);
//		index_begin = subString.indexOf(searchString_begin);
//		
		List<Integer> output = new ArrayList<Integer>();
		
		String[] myArray = xml.split("id");
		
		for (int i=0 ; i<myArray.length; i++)
		{
			if (myArray[i].contains(message))
			{
				myArray[i] = myArray[i].replaceAll(message, "");
				myArray[i] = myArray[i].replaceAll("=", "");
				myArray[i] = myArray[i].replaceAll(" ", "");
				myArray[i] = myArray[i].replaceAll("	", "");
				myArray[i] = myArray[i].replaceAll("\"", "");
				myArray[i] = myArray[i].replaceAll("/", "");
				myArray[i] = myArray[i].replaceAll(">", "");
				myArray[i] = myArray[i].replaceAll("<", "");
				myArray[i] = myArray[i].replaceAll("message", "");
				myArray[i] = myArray[i].replaceAll("entry", "");
				myArray[i] = myArray[i].replaceAll("\n", "");
				myArray[i] = myArray[i].replaceAll("log", "");
				//System.out.println(myArray[i]);
				output.add(Integer.valueOf(myArray[i]));
			}
			
			
		}
		
		return output;
	}
	
	public static void main (String[] args) throws Exception{
		String xml = 
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<log>\n" + 
                "    <entry id=\"1\">\n" + 
                "        <message>Application started</message>\n" + 
                "    </entry>\n" + 
                "    <entry id=\"2\">\n" + 
                "        <message>Application ended</message>\n" + 
                "    </entry>\n" + 
                "    <entry id=\"34\">\n" + 
                "        <message>Application ended</message>\n" + 
                "    </entry>\n" +
                "    <entry id=\"45\">\n" + 
                "        <message>Application ended</message>\n" + 
                "    </entry>\n" +
                "</log>";
		String wantedMSG= "Application ended";
		//System.out.println(xml);
		
		Collection<Integer> ids= getIdsByMessage(xml, wantedMSG);
		for (int id:ids){
			System.out.println(id);
		}
	}
}
