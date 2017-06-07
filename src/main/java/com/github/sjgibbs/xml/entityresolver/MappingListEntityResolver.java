package com.github.sjgibbs.xml.entityresolver;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

/**
 * @author Simon
 * @since 26/05/2017
 */
public class MappingListEntityResolver implements EntityResolver {

	private final List<AbstractEntityMapping> mappings;
	private boolean allowInternet;

	public MappingListEntityResolver(List<AbstractEntityMapping> mappings, boolean allowInternet) {
		this.mappings = mappings;
		this.allowInternet = allowInternet;
	}

	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {

		for(AbstractEntityMapping mapping : mappings) {
			if(mapping.matches(publicId, systemId)) {
				return mapping.openInputSource();
			}
		}

		if(!allowInternet) {
			throw new IOException("I/O disabled");
		}

		// the parser will access the URL directly
		return null;
	}
}
