package com.me;

@FunctionalInterface
public interface MyFunction<R,U,V> {
	public R apply(U u,V v); 

}
