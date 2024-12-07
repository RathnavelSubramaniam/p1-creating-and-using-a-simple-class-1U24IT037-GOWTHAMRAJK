class Person
{
    String firstName;
    String lastName;
    int age;
    
    ///default controuctor
    public Person()
    {
        firstName = "";
        lastName = "";
        age = 0;
    }
    
    //perameterized constructor
    public Person(String firstName, String lastName, int age)
    {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
    }
    
    //method
    public String getFullName()
    {
        return firstName+" "+lastName;
    }
    
    //main method
    public static void main(String args[])
    {
    Person person1 = new Person("John","Doe",30);
    Person person2 = new Person("Alice","Smith",25);

    System.out.println("person 1 : "+person1.getFullName());
    System.out.println("person 2 : "+person2.getFullName());
    double averageAge = (person1.age+person2.age)/2.0;
    System.out.println("average Age : "+averageAge);
    }
}
