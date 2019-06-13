package pl.sda.java25.Zadanie_Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    public Person(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String toString = null;
        if(isMale) toString = "Moje imię to " + firstName + ", nazwisko to "+lastName+". Jestem w wieku "+ age+" lat i jestem mężczyzną!";
        if(!isMale) toString = "Moje imię to " + firstName + ", nazwisko to "+lastName+". Jestem w wieku "+ age+" lat i jestem kobietą!";
        return toString;
    }
}
