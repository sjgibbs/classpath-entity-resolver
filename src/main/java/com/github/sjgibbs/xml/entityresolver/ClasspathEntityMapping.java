package com.github.sjgibbs.xml.entityresolver;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Simon
 * @since 07/06/2017
 */
public class ClasspathEntityMapping extends AbstractEntityMapping {

	private ClassLoader classLoader;
	private String path;

	public ClasspathEntityMapping(String publicId, String systemId, ClassLoader classLoader, String path) {
		super(publicId, systemId);

		this.classLoader = classLoader;
		this.path = path;
	}

	@Override
	protected Reader openCharacterStream() {
		InputStream in = classLoader.getResourceAsStream(path);
		if(in==null) {
			throw new IllegalStateException("classloader and path (" + path + ") point to a null resource stream");
		}
		return new InputStreamReader(in);
	}
}
