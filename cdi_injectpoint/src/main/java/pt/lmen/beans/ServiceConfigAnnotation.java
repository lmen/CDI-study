package pt.lmen.beans;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

@Qualifier
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE })
public @interface ServiceConfigAnnotation {

	public static enum ID {
		ONE("one"), TWO("two");

		private String id;

		private ID(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public Path calcPath() {
			return Paths.get("C", id);
		}
	}

	@Nonbinding
	public ID id() default ID.ONE;

}
