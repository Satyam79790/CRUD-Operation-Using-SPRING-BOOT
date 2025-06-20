package com.project1.springproject1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Employee {
private long id;    
private String name;
private String phone;
private String email;
public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}

}