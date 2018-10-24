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
