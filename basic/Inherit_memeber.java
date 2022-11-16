package basic;

class Member {

    String Name, Age, Phone_number, Address, Salary;

    void printSalary() {
        System.out.println(Salary);
    }
}

class Employee extends Member {

    String specialization, department;
}

class Manager extends Member {
    String specialization, department;
}

public class Inherit_memeber {
    public void main(String[] args) {

        Member member = new Member();
        Employee employee = new Employee();
        Manager manager = new Manager();
        member.Age = "20";
        member.Name = "khushi";
        member.Address = "super city";
        member.Phone_number = "9316546277";
        member.Salary = "3000";
        member.printSalary();
        manager.printSalary();
        employee.printSalary();


    }
}

