package iTLClass6;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{
	int Emp_id;
	String name;
	String Dept;
}

public class XMLWriter {

	public static void main(String[] args) {
		
		
		try {
			
			// Object : which is creates in heap area of ram.
			// It is temporary !!
			Employee emp = new Employee();
			emp.Emp_id = 101;
			emp.name = "John";
			emp.Dept = "IT";
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			
			Element elmRoot = document.createElement("employees");
			Element elmEmployee = document.createElement("employee");
			Element elmEmp_id = document.createElement("Emp_id");
			Element elmName = document.createElement("name");
			Element elmDept = document.createElement("Dept");
			
			Text txtEmp_id = document.createTextNode(String.valueOf(emp.Emp_id));
			Text txtName = document.createTextNode(emp.name);
			Text txtDept = document.createTextNode(String.valueOf(emp.Dept));
			
			/*
			 	<employees>
			 		<employee>
			 			<Emp_id>101</Emp_id>
			 			<name>John</name>
			 			<Dept>50000</Dept>
			 		</employee>
			 	</employees>		
			 */
			
			elmEmp_id.appendChild(txtEmp_id);
			elmName.appendChild(txtName);
			elmDept.appendChild(txtDept);
			
			elmEmployee.appendChild(elmEmp_id);
			elmEmployee.appendChild(elmName);
			elmEmployee.appendChild(elmDept);
			
			elmRoot.appendChild(elmEmployee);
			
			document.appendChild(elmRoot);
			
			// Write document into a file
			File file = new File("C:\\02A Personal\\03 Learning\\Java\\Edureka\\ILT\\Class#6\\Employees.xml");
			FileOutputStream outputStream = new FileOutputStream(file);
			StreamResult result = new StreamResult(outputStream);
			
			DOMSource source = new DOMSource(document);
			
			Transformer transformer  = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			
			System.out.println("==XML Written==");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	

	}

}
