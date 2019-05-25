package iTLClass6;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import java.io.File;

import org.w3c.dom.*;


public class iTLClass61 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File fXmlFile = new File("C:\\02A Personal\\03 Learning\\Java\\Edureka\\ILT\\Class#6\\Student.xml");
		//Get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		//Build Document
		Document document = (Document) builder.parse(fXmlFile);
		 
		//Normalize the XML Structure; It's just too important !!
		((Node) document.getDocumentElement()).normalize();
		 
		//Here comes the root node
		Element root = (Element) document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all employees
		NodeList nList = ((org.w3c.dom.Document) document).getElementsByTagName("Student");
		System.out.println("============================");
		System.out.println("Length:"+nList.getLength());
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		// System.out.println("Hello");    //Just a separator
		 System.out.println("=====Next Item ====");
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		   System.out.println("Sudent id : "  + eElement.getAttribute("Id"));
		   // System.out.println("StudentId : "  + eElement.getElementsByTagName("StudentId").item(0).getTextContent());
		    System.out.println("StudentName : "  + eElement.getElementsByTagName("StudentName").item(0).getTextContent());
		    System.out.println("StudentStd : "   + eElement.getElementsByTagName("StudentStd").item(0).getTextContent());
		    System.out.println("StudentGender : "    + eElement.getElementsByTagName("StudentGender").item(0).getTextContent());
		    System.out.println("StudentMarks : "    + eElement.getElementsByTagName("StudentMarks").item(0).getTextContent());
		    System.out.println("StudentStreet : "    + eElement.getElementsByTagName("StudentStreet").item(0).getTextContent());
		 }
		}
	}

}
