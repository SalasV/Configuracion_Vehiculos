package LectorXML;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LectorXML {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File("cv_config.xml"));

			doc.getDocumentElement().normalize();
			String car_conf_path = doc.getElementsByTagName("car_configuration_path").item(0).getTextContent(), 
					car_conf_file_name = doc.getElementsByTagName("car_configuration_file_name").item(0).getTextContent(),
					emp_list[] = doc.getElementsByTagName("employee_list").item(0).getTextContent().split(","),
					emp_password[] = doc.getElementsByTagName("employee_password").item(0).getTextContent().split(","),
					specifications_file_path = doc.getElementsByTagName("specifications_file_path").item(0).getTextContent(),
					version = doc.getElementsByTagName("version").item(0).getTextContent();

			boolean emp;
			if(doc.getElementsByTagName("employee_version").item(0).getTextContent().equalsIgnoreCase("true")) 
				emp = true;
			else
				emp = false;
		System.out.println(car_conf_file_name);

			
			

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

	}

}
