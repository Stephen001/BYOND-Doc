package com.awesome.byond.doc.parser;

import com.awesome.byond.doc.model.Type;
import com.awesome.byond.doc.model.Variable;

public interface ParsingContext {
	public void addGlobalVariable(Variable variable);

	public void addType(Type type);
}