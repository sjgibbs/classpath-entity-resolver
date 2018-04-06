package com.github.sjgibbs.xml.entityresolver;

import com.github.sjgibbs.xml.entityresolver.dtd.PackagedDtdsEntityResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.Reader;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoadAllTest {

	static Stream<String> publicIds() {
		return PackagedDtdsEntityResolver.PACKAGED_MAPPINGS.stream()
				.map(AbstractEntityMapping::getPublicId);
	}

	@ParameterizedTest
	@MethodSource("publicIds")
	void shouldBeAbleToLoadAllDefinedMappingsByPublicId(String publicId) throws IOException, SAXException{
		EntityResolver resolver = PackagedDtdsEntityResolver.OFFLINE;

		InputSource source = resolver.resolveEntity(publicId,null);

		Assertions.assertNotNull(source);

		try(Reader reader = source.getCharacterStream()) {
			assertTrue(reader.ready());
			assertNotEquals(-1,reader.read());
		}

	}

}
