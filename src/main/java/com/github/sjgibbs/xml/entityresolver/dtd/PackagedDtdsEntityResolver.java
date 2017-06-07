package com.github.sjgibbs.xml.entityresolver.dtd;

import com.github.sjgibbs.xml.entityresolver.AbstractEntityMapping;
import com.github.sjgibbs.xml.entityresolver.MappingListEntityResolver;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Simon
 * @since 07/06/2017
 */
public class PackagedDtdsEntityResolver {
	public static List<AbstractEntityMapping> PACKAGED_MAPPINGS = asList(SvgDtd.VERSION_1_1);
	public static MappingListEntityResolver OFFLINE = new MappingListEntityResolver(PACKAGED_MAPPINGS, false);
	public static MappingListEntityResolver ONLINE = new MappingListEntityResolver(PACKAGED_MAPPINGS, true);
}
