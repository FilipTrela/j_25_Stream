package pl.sda.java25.Zadanie_Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Jacek", "Kowalski", 18, true);
        Person person2 = new Person("Jacek", "Górski", 15, true);
        Person person3 = new Person("Andżelika", "Dżoli", 25, false);
        Person person4 = new Person("Wanda", "Ibanda", 12, false);
        Person person5 = new Person("Marek", "Marecki", 17, true);
        Person person6 = new Person("Johny", "Brawo", 25, true);
        Person person7 = new Person("Stary", "Pan", 80, true);
        Person person8 = new Person("Newbie", "Noob", 12, true);
        Person person9 = new Person("Newbies", "Sister", 19, false);

        List<Person> list = new ArrayList<Person>(Arrays.asList(
                person1,
                person2,
                person3,
                person4,
                person5,
                person6,
                person7,
                person8,
                person9
        ));
        System.out.println("Zadanie 1:");
        List<Person> listaMen = list.stream().filter(Person::isMale).collect(Collectors.toList());
        for (Person p : listaMen) System.out.println(p);
        System.out.println("------------------------");
        System.out.println("Zadanie 2:");
        List<Person> adultWomen = list.stream().filter((person -> !person.isMale())).filter(person -> person.getAge() > 17).collect(Collectors.toList());
        for (Person p : adultWomen) System.out.println(p);
        System.out.println("------------------------");
        System.out.println("Zadanie 3:");
        List<Person> adultWomenstartB = list.stream().filter(person -> !person.isMale()).filter(person -> person.getAge() > 17).filter(person -> person.getFirstName().startsWith("b")).collect(Collectors.toList());
        for (Person p : adultWomenstartB) System.out.println(p);
        System.out.println("------------------------");
        System.out.println("Zadanie 4");
        Optional<Person> doroslyJacek = list.stream().filter(person -> person.getAge() > 17 && person.getFirstName().equalsIgnoreCase("jacek")).findFirst();
        System.out.println(doroslyJacek.get());
        System.out.println("------------------------");
        System.out.println("Zadanie 5");
        List<Integer> listaWieku = list.stream().map(Person::getAge).collect(Collectors.toList());
        System.out.println("------------------------");
        System.out.println("Zadanie 6");
        List<String> listaNazwisk = list.stream().filter(person -> person.getAge() > 14 && person.getAge() < 20).map(person -> person.getLastName()).collect(Collectors.toList());
        for(String s:listaNazwisk) System.out.println(s);
        System.out.println("------------------------");
        System.out.println("Zadanie 7");
        Long sumaWieku = list.stream().mapToInt(Person::getAge).count();
        System.out.println("Suma wieku wszytskich osób to "+sumaWieku);
        System.out.println("------------------------");
        System.out.println("Zadanie 8");
        OptionalDouble sredniaWiekuMen = list.stream().filter(Person::isMale).mapToInt(Person::getAge).average();
        System.out.println("Średnia wieku wszytskich mężczyzn to "+sredniaWiekuMen.getAsDouble());
        System.out.println("------------------------");
        System.out.println("Zadanie 9");
        Optional<Person> oldGuy = list.stream().filter(person -> (person.getAge() == list.stream().mapToInt(Person::getAge).max().getAsInt())).findAny();
        System.out.println(oldGuy);


    }
}