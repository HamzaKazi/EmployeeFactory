**Description Summary of Our Repository:**
 Our repository contains a binary search tree that takes advantage of generics so that it can accept any object into it for performing operations like searching, adding and sorting on those objects.We were given a class that assists us with loading values from a CSV that we could then use to generate Employee objects. we can pass a String that simply contains the lastName of an employee to fetch their object from the tree, another detail abstracted away would be conversions from Object[] to Employee[].

**Requirements to Run these Files:**
JDK 19
Maven
JVM

**Make sure to change the pom.xml to match the version of Java that your JVM supports (19) and then run the following commands:**

mvn install
java -cp target/EmployeeFactory-1.0-SNAPSHOT.jar com.sparta.group3.Main


**Project Roles:**

| Role        | Contributor  | 
|-------------|--------------|
| Scrum Lead  | Rafael Lopes |       |
| GitHub Lead | Hamza Kazi   |       |
| Dev/Tester  | Onur Belek   |       |
| Dev/Tester  | Omar Hussain |       |
| Dev/Tester  | Anusha Gampa |       |

**Details of the Functionality in Major Sections:**

BinarySearchTree.java:

Our binary search tree accepts and sorts any object that implements the Comparable interface.It has one constructor with one parameter that takes list of objects and for each object it calls insert method to insert each object into a Binary Search Tree according to binary tree rules. It has an Inner class of Node which initializes the 3 different types of nodes that are current node, left node, right node.
            

**Employee.java:**
Employee class implements Comparable interface. Class represents an individual employee object. It has private variables for employee number, birth date, first name, last name, gender, and hire date. The class has a constructor that takes employee data as a string and parses it to assign the values to the private variables.The class also has getters for each private variable and overrides the toString method to return formatted employee data. 
          
we have some of Getter and setter methods like

 public int getEmpID() ;

returns an employee id from tree.

public String getFirstName();

returns first name of an employee.

public void setLastName(String lastName);

set the employee last name.

**Summary of Testing:**

We used JUnit 5 in our program to unit test our classes. We primarily focused on the getters and setters of every class that we created. and also we tested search, insertion methods functionality with different set of inputs.


   