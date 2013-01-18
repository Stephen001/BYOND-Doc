package com.awesome.byond.doc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://awesomeware.org/byond/doc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Type {
	@XmlElement(required = true)
	private String description;
	@XmlElement(required = true)
	private String name;
	private String parentType;
	@XmlElementWrapper(name = "variables")
	@XmlElement(name = "variable")
	private List<Variable> variables;
	
	private Type() {}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getParentType() {
		return parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}
}
