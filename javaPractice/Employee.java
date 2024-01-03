import java.util.*;

class Employee
{
  private static int nextId;

  private int id;
  private String name = "";
  private double salary;

  // static initialization block
  static
  {
    var generator = new Random();
    // set nextId to a random number between 0 and 9999
    nextId = generator.nextInt(10000);
  }
  
  // object initialization block
  {
    id = nextId;
    nextId++;
  }

  // three overloaded constructors
  public Employee(String aName, double aSalary){
    name = aName;
    salary = aSalary;
  }

  public Employee(double aSalary) {
    // calls the Employee(String, double) as construcctor
    this("Employee #" + nextId, aSalary);
  }

  // the default constructor
  public Employee() {
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public int getId() {
    return id;
  }

}