package com.nash.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.persistence.Entity;

public abstract class GenericSericeHandler<T> {
	
	public boolean isAllowed() {
		return true;
	}
	public abstract void preStep();
	
	public abstract void postStep();

	public abstract void execute(String methodName, Object entity) throws NoSuchMethodException, SecurityException,InvocationTargetException, IllegalAccessException, IllegalArgumentException ;	
	
}
