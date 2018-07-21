package com.mahendra.models;
import java.io.File;
import java.nio.*;
import java.nio.file.Path;

import static java.lang.System.*;
import static java.lang.Math.*;

@Author(name="Mahendra",description="Demo App")
public class TestNIO2 {

	public static void main(String[] args) {
		File file = new File("d:/data/test.txt");
		Path path = file.toPath();
		String root = path.getRoot().toString();
		out.println("Root: "+root);
		String parent = path.getParent().toString();
		out.println("Parent dir "+parent);
		
	double area = pow(12.56,2) * PI;
	}

}
