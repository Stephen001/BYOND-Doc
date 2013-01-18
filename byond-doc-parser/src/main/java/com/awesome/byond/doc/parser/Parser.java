package com.awesome.byond.doc.parser;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;

public interface Parser {
	public ParsingContext parse(InputStream stream);
	
	public ParsingContext parse(File file);
	
	public ParsingContext parse(Path path);
}
