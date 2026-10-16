package javaClass.signleton;

public class Company {
    private static Company company = new Company();

    private Company(){}

    public static Company  getInstance() {
        if (company == null) {
            company = new Company();
        }
        return company;
    }
}
