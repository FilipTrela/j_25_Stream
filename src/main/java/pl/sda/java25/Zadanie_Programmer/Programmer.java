package pl.sda.java25.Zadanie_Programmer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.java25.Zadanie_Person.Person;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Programmer {
    private Person person;
    private List<String> languages;
}
