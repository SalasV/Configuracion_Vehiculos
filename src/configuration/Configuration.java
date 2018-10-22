package configuration;

import java.util.ArrayList;

public class Configuration {
	private String car_configuration_path, car_configuration_file_name, specifications_file_path,version;
	private String[] employee_list, employee_password;
	private boolean employee_version;
	
	public Configuration() {
		
	}

	public Configuration(String car_configuration_path, String car_configuration_file_name,
			String specifications_file_path, String[] employee_list, String[] employee_password, String version,
			boolean employee_version) {
		
		this.car_configuration_path = car_configuration_path;
		this.car_configuration_file_name = car_configuration_file_name;
		this.specifications_file_path = specifications_file_path;
		this.employee_list = employee_list;
		this.employee_password = employee_password;
		this.version = version;
		this.employee_version = employee_version;
	}

	public String getCar_configuration_path() {
		return car_configuration_path;
	}

	public void setCar_configuration_path(String car_configuration_path) {
		this.car_configuration_path = car_configuration_path;
	}

	public String getCar_configuration_file_name() {
		return car_configuration_file_name;
	}

	public void setCar_configuration_file_name(String car_configuration_file_name) {
		this.car_configuration_file_name = car_configuration_file_name;
	}

	public String getSpecifications_file_path() {
		return specifications_file_path;
	}

	public void setSpecifications_file_path(String specifications_file_path) {
		this.specifications_file_path = specifications_file_path;
	}

	public String[] getEmployee_list() {
		return employee_list;
	}

	public void setEmployee_list(String[] employee_list) {
		this.employee_list = employee_list;
	}

	public String[] getEmployee_password() {
		return employee_password;
	}

	public void setEmployee_password(String[] employee_password) {
		this.employee_password = employee_password;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isEmployee_version() {
		return employee_version;
	}

	public void setEmployee_version(boolean employee_version) {
		this.employee_version = employee_version;
	}

	
}
