package filehandling;

import java.io.Serializable;

//Serializable-interface which is used to convert object into stream
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
