package lab.bjes.serialization;

import java.io.*;
import java.math.BigDecimal;

import static lab.bjes.serialization.Employee.employeeToString;

public class SerializationLab {
    static String fileName = "files/serialization/outputEmployee";

    public SerializationLab() throws IOException, ClassNotFoundException {
        serialize(new Employee("bjes", 30, new BigDecimal(50000)));
        deserialize();
    }

    private void serialize(Employee employee) throws IOException{
        System.out.println("--- Serialization - Write Employee-object to file");
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employee);
            oos.flush();
        }
        System.out.println("Successfully wrote to file: " + fileName);
    }
    private void deserialize() throws IOException, ClassNotFoundException{
        System.out.println("--- Deserialization - Read Employee-object from file");
        Employee result = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = (Employee) ois.readObject();
        }

        System.out.println("File " + fileName + " contains: " + result);
        System.out.println("To String: " + employeeToString(result));
        System.out.println("Salary should be null since it's a transient member");
    }
}

class Employee implements Serializable{

    @Serial
    private static final long serialVersionUID = 420L;
    String name;
    int age;

    transient BigDecimal salary;

    public Employee(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static String employeeToString(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(employee.name).append(", ");
        sb.append("Age: ").append(employee.age).append(", ");
        sb.append("Salary: ").append(employee.salary).append(". ");
        return sb.toString();
    }
}
/* Exception if class doesn't implement Serializable
java.io.NotSerializableException: lab.bjes.serialization.Employee
        at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1200)
        at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:358)
        at lab.bjes.serialization.SerializationLab.serialize(SerializationLab.java:21)
        at lab.bjes.serialization.SerializationLab.<init>(SerializationLab.java:12)
        at lab.bjes.Main.main(Main.java:131)

 */