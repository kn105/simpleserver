package kn.server.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author krishnanand
 *
 */
public class ServerConfig {
	private static final String BUNDLE_NAME = "resources/server";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private ServerConfig() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}