package com.github.sjgibbs.xml.entityresolver;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Simon
 * @since 07/06/2017
 */
public class ClasspathEntityMapping extends AbstractEntityMapping {

	private Class classInBasePackage;
	private String path;

	public ClasspathEntityMapping(String publicId, String systemId, Class classInBasePackage, String path) {
		super(publicId, systemId);

		this.classInBasePackage = classInBasePackage;
		this.path = path;
	}

	@Override
	protected Reader openCharacterStream() {
		InputStream in = classInBasePackage.getResourceAsStream(path);
		if(in==null) {
			throw new IllegalStateException("classloader and path (" + path + ") point to a null resource stream");
		}
		return new InputStreamReader(in);
	}


}
