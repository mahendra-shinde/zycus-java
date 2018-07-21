package com.mahendra.models;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
public @interface Author {
	String name();
	String description();
}
