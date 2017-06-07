package com.github.sjgibbs.xml.entityresolver;

import org.xml.sax.InputSource;

import java.io.Reader;

/**
 * @author Simon
 * @since 26/05/2017
 */
public abstract class AbstractEntityMapping {

	private String publicId;
	private String systemId;

	public AbstractEntityMapping(String publicId, String systemId) {
		this.publicId = publicId;
		this.systemId = systemId;
	}

	public boolean matches(String publicId, String systemId) {
		if(publicId.equals(this.publicId)) {
			return true;
		} else if(this.hasPublicId()) {
			/* There is a canonical identifier which does not
			 * match. Treat entity as different.
			 */
			return false;
		}

		// if we know the URL then it should be OK
		return systemId.equals(this.systemId);

	}

	private boolean hasPublicId() {
		if(publicId==null) {
			return false;
		}
		if(publicId.isEmpty()) {
			return false;
		}
		return true;
	}

	public InputSource openInputSource() {
		InputSource source = new InputSource();
		source.setPublicId(publicId);
		source.setSystemId(systemId);
		source.setCharacterStream(openCharacterStream());
		return source;
	}

	protected abstract Reader openCharacterStream();
}
