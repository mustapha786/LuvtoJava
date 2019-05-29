package iTLClass6;
import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler {
	
	public void startDocument() throws SAXException {
		System.out.println("==XML Parsing Started==");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
		
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.print(data);
	}
	
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("==XML Parsing Finished==");
	}
}


public class iTLClass62  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			File file = new File("C:\\02A Personal\\03 Learning\\Java\\Edureka\\ILT\\Class#6\\Student.xml");
			FileInputStream inputStream = new FileInputStream(file); // To Read File
			
			MyHandler handler = new MyHandler();
			
			//SAXParserFactory factory = SAXParserFactory.newInstance();
			//SAXParser parser = factory.newSAXParser();
			
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			parser.parse(inputStream, handler);
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}
