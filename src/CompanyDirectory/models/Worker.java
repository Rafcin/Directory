package CompanyDirectory.models;

enum Department {
  Factory,
  Office,
  Promo,
  Ecommerce,
  Tech,
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
