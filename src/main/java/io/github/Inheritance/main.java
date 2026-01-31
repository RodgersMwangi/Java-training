package io.github.Inheritance;

public class main {
    public static void main(String[] args) {
        //Employee employee=new Employee("john Doe", "4324234", 10000);
        //Manager manager=new Manager("john Mow", "4424234", 10000);
        //Developer developer1=new Developer("john Dow", "4323234", 10000);
        //employee.displayInfo();
        //manager.displayInfo();
        //developer1.displayInfo();
        //System.out.println(employee.calculateBonus());
        //ScientificCalculator calc=new ScientificCalculator();
        //Calculator cal=new Calculator();
        //double answer=calc.power(-5, 8);
        //double answerSquareRoot=calc.squareRoot(100);
        //System.out.println(cal.add(5,7,3));
        //System.out.println(calc.add("Hello","World"));

        BankAccount customer1=new BankAccount("39848383", "Jane Doe", 1000);
        SavingsAccount customer2 = new SavingsAccount("233233", "Rex Ham", 250);
        customer2.deposit(350);
        customer2.applyInterest();
        
        
        System.out.println(customer2.getBalance());
        
    }

}
