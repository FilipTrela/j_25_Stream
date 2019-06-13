package pl.sda.java25.Zadanie_Programmer;

import pl.sda.java25.Zadanie_Person.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<String> languages1 = Arrays.asList("Java;Cobol;Cpp;Lisp".split(";"));
        List<String> languages2 = Arrays.asList("Java;Lisp".split(";"));
        List<String> languages3 = Arrays.asList("Java;Cobol;Cpp;Lisp;C#".split(";"));
        List<String> languages4 = Arrays.asList("C#;C;Cpp".split(";"));
        List<String> languages5 = Arrays.asList("Java;Assembler;Scala;Cobol".split(";"));
        List<String> languages6 = Arrays.asList("Java;Scala".split(";"));
        List<String> languages7 = Arrays.asList("C#;C".split(";"));
        List<String> languages8 = Collections.emptyList();
        List<String> languages9 = Arrays.asList("Java");
        Programmer programmer1 = new Programmer(person1, languages1);
        Programmer programmer2 = new Programmer(person2, languages2);
        Programmer programmer3 = new Programmer(person3, languages3);
        Programmer programmer4 = new Programmer(person4, languages4);
        Programmer programmer5 = new Programmer(person5, languages5);
        Programmer programmer6 = new Programmer(person6, languages6);
        Programmer programmer7 = new Programmer(person7, languages7);
        Programmer programmer8 = new Programmer(person8, languages8);
        Programmer programmer9 = new Programmer(person9, languages9);
        List<Programmer> programmers = Arrays.asList(programmer1, programmer2, programmer3, programmer4, programmer5, programmer6, programmer7, programmer8, programmer9);
        System.out.println(programmers);
        System.out.println("Przykład a;");
        List<Programmer> menProgrammer = programmers.stream().filter(programmer -> programmer.getPerson().isMale()).collect(Collectors.toList());
        System.out.println("_____________");
        System.out.println("Przykład b;");
        List<Programmer> youngProgrammerCobol = programmers.stream().filter(programmer -> programmer.getPerson().getAge()<19).filter(programmer -> programmer.getLanguages().stream().anyMatch(jezyk -> jezyk.equalsIgnoreCase("cobol"))).collect(Collectors.toList());
        System.out.println("_____________");
        System.out.println("Przykład c;");
        List<Programmer> moreThanOneLanguages = programmers.stream().filter(programmer -> programmer.getLanguages().size()>1).collect(Collectors.toList());
        System.out.println("_____________");
        System.out.println("Przykład d;");
        List<Programmer> javaAndCpp = programmers.stream().filter(programmer -> programmer.getLanguages().contains("java")).filter(programmer -> programmer.getLanguages().contains("cpp")).collect(Collectors.toList());
        System.out.println("_____________");
        System.out.println("Przykład e;");
        List<String> imionaMen = programmers.stream().filter(programmer -> programmer.getPerson().isMale()).map(programmer -> programmer.getPerson().getFirstName()).collect(Collectors.toList());
        System.out.println("_____________");
        System.out.println("Przykład f;");
        Set<String> setJezykow = programmers.stream().flatMap(jezyk -> jezyk.getLanguages().stream()).collect(Collectors.toSet());
        System.out.println("_____________");
        System.out.println("Przykład g;");
        List<String> imionaPorgramistowKtorzyZnajaWiecejNizDwaJezyki = programmers.stream().filter(programmer -> programmer.getLanguages().size()>2).map(programmer -> programmer.getPerson().getFirstName()).collect(Collectors.toList());
        System.out.println("_____________");
        System.out.println("Przykład h;");
        boolean czyIstnieje = programmers.stream().anyMatch(programmer -> programmer.getLanguages().size()>0);
        System.out.println("Przykład i;");
        System.out.println("_____________");






    }
}
