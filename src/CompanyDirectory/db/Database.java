package CompanyDirectory.db;

import java.util.ArrayList;
import java.util.UUID;

import CompanyDirectory.models.Employee;

/**
 * Agnostic database designed to handle a companies employee directory.
 */
public class Database {
  public Database() {
    employees_ = new ArrayList<Employee>();
  }

  /**
   * Adds an employee to the database.
   * @param employee The employee to add.
   */
  public void addEmployee(Employee employee) {
    employees_.add(employee);
  }

  /**
   * Removes an employee from the database.
   * @param employee The employee to remove.
   */
  public void removeEmployee(Employee employee) {
    employees_.remove(employee);
  }

  /**
   * Gets an employee from the database.
   * @param id The id of the employee to get.
   * @return The employee with the given id.
   */
  public Employee getEmployee(UUID id) {
    for (Employee employee : employees_) {
      if (employee.getId().equals(id)) {
        return employee;
      }
    }
    return null;
  }

  /**
   * Gets all employees from the database.
   * @return All employees in the database.
   */
  public ArrayList<Employee> getAllEmployees() {
    return employees_;
  }

  /**
   * Get employees from the database with the option to filter by attributes.
   * @param filter A JSON object containing the attributes to filter by.
   * @param sort A JSON object containing the attributes to sort by.
   * @param pageSize The max number of employees to return per page. Return a token for the next page.
   * @return All employees in the database that match the given attributes and a token for the next page if applicable.
   */
  public ArrayList<Employee> getEmployees(String filter, String sort, int pageSize) {
    //Filter depending on the db could stay as is, be transformed into a SQL query using jOOQ etc. The same applies for sort.
    //Page size is pretty standard, you pass a int representing the max number of employees to return per page and that just kind of exists.
    return employees_;
  }

  private ArrayList<Employee> employees_;
}