package CompanyDirectory.models;

public class Executive extends Employee {
  public Executive(String name, EmployeeRole role) {
    super(name, role);
  }

  public int getDirectReports() {
    return directReports_;
  }

  public void setDirectReports(int directReports) {
    directReports_ = directReports;
  }

  public void addDirectReport() {
    ++directReports_;
  }

  public void removeDirectReport() {
    --directReports_;
  }

  public int getInDirectReports() {
    return inDirectReports_;
  }

  public void setInDirectReports(int inDirectReports) {
    inDirectReports_ = inDirectReports;
  }

  public void addInDirectReport() {
    ++inDirectReports_;
  }

  public void removeInDirectReport() {
    --inDirectReports_;
  }

  private int inDirectReports_ = 0;
  private int directReports_ = 0;
}
