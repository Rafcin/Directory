package CompanyDirectory.db;

import java.util.ArrayList;
import java.util.UUID;

import CompanyDirectory.models.Employee;

public class Database {

  public Database() {
    employees_ = new ArrayList<Employee>();
  }

  public void addWorker(Employee employee) {
    employees_.add(employee);
  }

  public void deleteWorker(UUID employeeID) {
    deleteEmployee(employeeID);
  }

  public void addExecutive(Employee employee) {
    employees_.add(employee);
  }

  public void deleteExecutive(UUID employeeID) {
    deleteEmployee(employeeID);
  }

  public void addManager(Employee employee) {
    employees_.add(employee);
  }

  public void deleteManager(UUID employeeID) {
    deleteEmployee(employeeID);
  }

  public void printWorkers() {
    // 7. Print all Workers, sorted by “Last Name, First Name”
  }

  public void printExecutives() {
    // 8. Print all Executives, sorted by “Last Name, First Name”
  }

  public void printManagers() {
    // 9. Print all Managers, sorted by “Last Name, First Name”
  }

  public void printEmployees() {
    // 10. Print the entire company directory, sorted by “Last Name, First
    // Name”. The role of the person (Executive, Manager, Worker)
    // should be displayed for each person.
  }

  // 11. Add a new Worker, Executive, or Manager using an existing
  // Worker, Executive, or Manager object (clone).

  // write to db
  public boolean write() {
    return true;
  }

  private void deleteEmployee(UUID employeeID) {
    for (int i = 0; i < employees_.size(); i++) {
      if (employeeID.equals(employees_.get(i).getId())) {
        employees_.remove(i);
        return;
      }
    }
  }

  private ArrayList<Employee> employees_;
}
