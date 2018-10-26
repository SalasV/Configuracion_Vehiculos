<<<<<<< HEAD
package configuration;

import java.io.File;

import LectorXML.LectorXML;

public class ConfigurationLoader {
	private File fichero_coches;
	private String ruta;
	private static Configuration configuration;

	public static Configuration getConfiguration() {// Comprueba que no hemos creado la clase
													// anteriormente

		

		if (configuration == null) {// Si no lo esta la crea

			new ConfigurationLoader();

		}

		return configuration;// Devuelve el archivo
	}

	private ConfigurationLoader() {// Carga el archivo con la ruta
		this.configuration = new LectorXML().getConfiguration();
	}
}
=======
package configuration;

import java.io.File;

public class ConfigurationLoader extends Configuration{
	private File fichero_coches;
	private String ruta;
	
	private static ConfigurationLoader miconfigurador;

	public static ConfigurationLoader getConfigurador(String ruta) {// Comprueba que no hemos creado la clase
																	// anteriormente

		if (miconfigurador == null) {//Si no lo esta la crea

			miconfigurador = new ConfigurationLoader(ruta);

		}

		return miconfigurador;//Devuelve el archivo
	}

	private ConfigurationLoader(String ruta) {//Carga el archivo con la ruta

		this.fichero_coches = new File(ruta);
	}
}
>>>>>>> refs/remotes/origin/master
