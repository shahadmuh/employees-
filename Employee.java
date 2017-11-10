public abstract class Employee {
protected String Name;
protected String SSN;

public Employee (String name, String SSN){
Name=name;
this.SSN=SSN;}

public abstract double earnings();}