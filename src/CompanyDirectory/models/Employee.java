package CompanyDirectory.models;

import java.util.UUID;

enum EmployeeRole {
  Worker,
  Manager,
  Executive
}

public class Employee {

  public String getFirstName() {
    return firstName_;
  }

  public void setFirstName(String firstName) {
    firstName_ = firstName;
  }

  public String getLastName() {
    return lastName_;
  }

  public void setLastName(String lastName) {
    lastName_ = lastName;
  }

  public String getTelephoneNumber() {
    return telephoneNumber_;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    telephoneNumber_ = telephoneNumber;
  }

  public String getEmail() {
    return email_;
  }

  public void setEmail(String email) {
    email_ = email;
  }

  public UUID getId() {
    return id_;
  }

  public void setId(UUID id) {
    id_ = id;
  }

  public EmployeeRole getRole() {
    return employeeRole_;
  }

  public void setRole(EmployeeRole employeeRole) {
    employeeRole_ = employeeRole;
  }

  private String firstName_;
  private String lastName_;
  private String telephoneNumber_;
  private String email_;
  private UUID id_;
  private EmployeeRole employeeRole_;
}
