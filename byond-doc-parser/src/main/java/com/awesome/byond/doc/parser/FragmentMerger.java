package com.awesome.byond.doc.parser;

public interface FragmentMerger<T> {
	public T merge(final T existing, final T newObj);
}
