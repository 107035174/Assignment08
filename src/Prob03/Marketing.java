package Prob03;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Employee: " + employeeName + " | Product: " + productName + " | Amount sold: $" + salesAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() == o.getClass()) return false;
        Marketing n = (Marketing) o;
        return this.getEmployeeName().equals(n.employeeName) &&
                this.getProductName().equals(n.getProductName()) &&
                this.salesAmount == this.salesAmount;
    }
}
