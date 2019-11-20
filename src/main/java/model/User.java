package model;

import java.util.List;

import lombok.Data;

@Data
public class User {
	
	Long id;
	String name;
	String fullName;
	List<String> role;

}
