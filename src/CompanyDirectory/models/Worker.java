package CompanyDirectory.models;

enum Department {
  FACTORY,
  OFFICE,
  PROMO,
  ECOMMERCE,
  TECH,
  HR
}

public class Worker extends Employee {
  public Worker() {
    super();
  }

  public Worker(Department department) {
    super();
    department_ = department;
  }

  public Department getDepartment() {
    return department_;
  }

  public void setDepartment(Department department) {
    department_ = department;
  }

  private Department department_;
}
