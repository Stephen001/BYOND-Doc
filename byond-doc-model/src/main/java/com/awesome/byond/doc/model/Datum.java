package com.awesome.byond.doc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://awesomeware.org/byond/doc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Datum {
	@XmlElementWrapper(name = "variables")
	@XmlElement(name = "variable")
	private List<Variable> variables;
	@XmlElement(required = true)
	private String type;

	private Datum() {}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}
}
