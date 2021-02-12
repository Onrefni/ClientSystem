package br.com.rbf.converter;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

/**
 * Java Bean to Java Bean mapper. that recursively copies data from one object
 * to another.
 * 
 * @author Rommel Fonseca
 *
 */
public class DozerConverter {

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

	/**
	 * Parse a single {@link Object}
	 * @param <O>
	 * @param <D>
	 * @param origin
	 * @param destination
	 * @return Mapped Object
	 */
	public static <O, D> D parseObject(O origin, Class<D> destination) {
		return mapper.map(origin, destination);
	}

	/**
	 * Parse a List of the Objects.
	 * 
	 * @param <O>
	 * @param <D>
	 * @param origin
	 * @param destination
	 * @return Mapped List
	 */
	public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
		List<D> destinationObjects = new ArrayList<D>();
		for (Object obj : origin) {
			destinationObjects.add(mapper.map(obj, destination));
		}
		return destinationObjects;
	}
}
