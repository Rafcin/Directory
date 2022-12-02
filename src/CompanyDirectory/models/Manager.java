package CompanyDirectory.models;

public class Manager extends Employee {
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

  private int directReports_ = 0;
}
