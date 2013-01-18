package com.awesome.byond.doc.parser;

final class TypeKey {
	private final String name;
	private final String parentType;
	
	public TypeKey(final String name, final String parentType) {
		this.name = name;
		this.parentType = parentType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name.hashCode();
		result = prime * result	+ ((parentType == null) ? 0 : parentType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TypeKey))
			return false;
		TypeKey other = (TypeKey) obj;
		if (!name.equals(other.name))
			return false;
		if (parentType == null) {
			if (other.parentType != null)
				return false;
		} else if (!parentType.equals(other.parentType))
			return false;
		return true;
	}
	
	
}
