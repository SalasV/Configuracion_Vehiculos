package LectorXML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import configuration.Configuration;

public class LectorXML {

	public void getCarConfiguration() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Configuration conf = new Configuration();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File("cars_config.xml"));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public Configuration getConfiguration() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Configuration conf = new Configuration();
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

			boolean emp = doc.getElementsByTagName("employee_version").item(0).getTextContent().equalsIgnoreCase("true");
			
			
			conf = new Configuration(car_conf_path, car_conf_file_name, 
					specifications_file_path, emp_list, emp_password, version, emp);

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return conf;

	}

}
