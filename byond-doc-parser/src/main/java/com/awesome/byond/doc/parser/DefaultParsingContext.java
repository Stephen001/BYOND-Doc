package com.awesome.byond.doc.parser;

import java.util.HashMap;
import java.util.Map;

import com.awesome.byond.doc.model.Type;
import com.awesome.byond.doc.model.Variable;

public class DefaultParsingContext implements ParsingContext {
	protected final Map<String, Variable> globalVariables = new HashMap<String, Variable>();
	protected final Map<TypeKey, Type> types 				= new HashMap<TypeKey, Type>();
	protected final FragmentMerger<Type> typeMerger;
	protected final FragmentMerger<Variable> variableMerger;
	
	public DefaultParsingContext(FragmentMerger<Type> typeMerger, FragmentMerger<Variable> variableMerger) {
		this.typeMerger 	= typeMerger;
		this.variableMerger = variableMerger;
	}
	
	/* (non-Javadoc)
	 * @see com.awesome.byond.doc.parser.ParsingContext#addGlobalVariable(com.awesome.byond.doc.model.Variable)
	 */
	@Override
	public void addGlobalVariable(final Variable variable) {
		if (globalVariables.containsKey(variable.getName())) {
			globalVariables.put(variable.getName(), variableMerger.merge(globalVariables.get(variable.getName()), variable));
		} else {
			globalVariables.put(variable.getName(), variable);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.awesome.byond.doc.parser.ParsingContext#addType(com.awesome.byond.doc.model.Type)
	 */
	@Override
	public void addType(final Type type) {
		final TypeKey key = new TypeKey(type.getName(), type.getParentType());
		if (types.containsKey(key)) {
			types.put(key, typeMerger.merge(types.get(key), type));
		} else {
			types.put(key, type);
		}
	}
}
