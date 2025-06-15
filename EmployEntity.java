package com.project1.springproject1;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="employee")
public class EmployEntity {
@Id // for primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) // auto generate table
private long id;    
private String name;
private String phone;
private String email;
}
