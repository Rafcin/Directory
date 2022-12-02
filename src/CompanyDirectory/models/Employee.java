package CompanyDirectory.models;

import java.util.UUID;

enum EmployeeRole {
  WORKER,
  MANAGER,
  EXECUTIVE
}

/**
 * Employee class used for CompanyDirectory database.
 */
public class Employee {
  private String firstName_;
  private String lastName_;
  private String telephoneNumber_;
  private String email_;
  private UUID id_;
  private EmployeeRole employeeRole_;
  public Employee(String name, EmployeeRole role) {
    firstName_ = name;
    employeeRole_ = role;
    id_ = UUID.randomUUID();
  }

  public Employee() {
    id_ = UUID.randomUUID();
  }

  public String getFirstName() {
    return firstName_;
  }

  public String getLastName() {
    return lastName_;
  }

  public String getTelephoneNumber() {
    return telephoneNumber_;
  }

  public String getEmail() {
    return email_;
  }

  public UUID getId() {
    return id_;
  }

  public EmployeeRole getEmployeeRole() {
    return employeeRole_;
  }

  public void setFirstName(String firstName) {
    firstName_ = firstName;
  }

  public void setLastName(String lastName) {
    lastName_ = lastName;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    telephoneNumber_ = telephoneNumber;
  }

  public void setEmail(String email) {
    email_ = email;
  }

  public void setEmployeeRole(EmployeeRole employeeRole) {
    employeeRole_ = employeeRole;
  }
}