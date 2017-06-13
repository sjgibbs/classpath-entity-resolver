package com.github.sjgibbs.xml.entityresolver.dtd;

import com.github.sjgibbs.xml.entityresolver.AbstractEntityMapping;
import com.github.sjgibbs.xml.entityresolver.MappingListEntityResolver;
import com.github.sjgibbs.xml.entityresolver.dtd.svg.SvgDtd;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Simon
 * @since 07/06/2017
 */
public class PackagedDtdsEntityResolver {
	public static List<AbstractEntityMapping> PACKAGED_MAPPINGS = asList(
			SvgDtd.ANIMATION_1_1,
			SvgDtd.ANIM_EVENTS_1_1,
			SvgDtd.BASIC_CLIP_1_1,
			SvgDtd.BASIC_FILTER_1_1,
			SvgDtd.BASIC_FONT_1_1,
			SvgDtd.BASIC_GRAPHICS_ATTRIB_1_1,
			SvgDtd.BASIC_PAINT_ATTRIB_1_1,
			SvgDtd.BASIC_STRUCTURE_1_1,
			SvgDtd.BASIC_TEXT_1_1,
			SvgDtd.CLIP_1_1,
			SvgDtd.CONDITIONAL_1_1,
			SvgDtd.CONTAINER_ATTRIB_1_1,
			SvgDtd.CORE_ATTRIB_1_1,
			SvgDtd.CURSOR_1_1,
			SvgDtd.DATATYPES_1_1,
			SvgDtd.DOC_EVENTS_ATTRIB_1_1,
			SvgDtd.EXTENSIBILITY_1_1,
			SvgDtd.EXT_RESOURCES_ATTRIB_1_1,
			SvgDtd.FILTER_1_1,
			SvgDtd.FONT_1_1,
			SvgDtd.FRAMEWORK_1_1,
			SvgDtd.GRADIENT_1_1,
			SvgDtd.GRAPH_EVENTS_ATTRIB_1_1,
			SvgDtd.GRAPHICS_ATTRIB_1_1,
			SvgDtd.HYPERLINK_1_1,
			SvgDtd.IMAGE_1_1,
			SvgDtd.MARKER_1_1,
			SvgDtd.MASK_1_1,
			SvgDtd.OPACITY_ATTRIB_1_1,
			SvgDtd.PAINT_ATTRIB_1_1,
			SvgDtd.PATTERN_1_1,
			SvgDtd.PROFILE_1_1,
			SvgDtd.QNAME_1_1,
			SvgDtd.SCRIPT_1_1,
			SvgDtd.SHAPE_1_1,
			SvgDtd.STRUCTURE_1_1,
			SvgDtd.STYLE_1_1,
			SvgDtd.TEXT_1_1,
			SvgDtd.VIEW_1_1,
			SvgDtd.VIEWPORT_ATTRIB_1_1,
			SvgDtd.XLINK_ATTRIB_1_1,
			SvgDtd.ATTRIBS_1_1,
			SvgDtd.BASIC_ATTRIBS_1_1,
			SvgDtd.BASIC_MODEL_1_1,
			SvgDtd.BASIC_1_1,
			SvgDtd.MODEL_1_1,
			SvgDtd.TINY_ATTRIBS_1_1,
			SvgDtd.TINY_MODEL_1_1,
			SvgDtd.TINY_1_1,
			SvgDtd.SVG_1_1
	);
	public static MappingListEntityResolver OFFLINE = new MappingListEntityResolver(PACKAGED_MAPPINGS, false);
	public static MappingListEntityResolver ONLINE = new MappingListEntityResolver(PACKAGED_MAPPINGS, true);
}
