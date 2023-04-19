package Prob01;

class Person {
    private String lastName;
    private String firstName;
    private int age;

    // --------------------------------------------------------------
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }

    // --------------------------------------------------------------
    public String getLast() // get last name
    {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
                "\n Age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this.getClass() == o.getClass()) return false;
        Person n = (Person) o;
        return this.firstName.equals(n.firstName) && this.lastName.equals(n.lastName) && this.age == n.age;
    }
}
