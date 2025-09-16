class EmployeeRunner{
public static void main(String [] args){
EmployeeDetails employeeDetails=new EmployeeDetails();

Company company1=new Company(1,"aj");
Company company2=new Company(2,"roman");
Company company3=new Company(3,"rock");
Company company4=new Company(4,"virat");

Company [] floor={company1,company2,company3,company4};
employeeDetails.information(floor);

}

}