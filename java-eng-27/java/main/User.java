package main;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

//Mapping Class or Entity Class 
@Table("users")
class User {
    @Id public int code; // Indentify data
    public String email;
    String password; 
    @Column("first_name")
    public String firstName;  
    @Column("last_name")
    public String lastName;   
}

@Service
interface UserManager extends CrudRepository <User, Integer> { }



// ORM : Object Relation Mapping
