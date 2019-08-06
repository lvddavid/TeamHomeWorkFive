import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileInput extends Main {



//    Collections.sort(persons, new Comparator<Person>() {
//        public int compare(Person person, Person person1) {
//            int name = person.getName().compareTo(person1.getName());
//            if(name == 0){
//                return name;
//            }
//            return person.getAge() > person1.getAge() ? 1 : person.getAge() < person1.getAge() ? -1 : 0;
//        }
//    });
//
//
//        for (Person person : persons) {
//        System.out.println("Person is: " + person.getName());
//    }
    public static class Person implements Comparable<Person> {

        private String NameOfArtist;
        private String SongName;
        private int Minutes;

        public String getNameOfArtist() {
            return NameOfArtist;
        }

        public void setNameOfArtist(String nameOfArtist) {
            NameOfArtist = nameOfArtist;
        }

        public String getSongName() {
            return SongName;
        }

        public void setSongName(String songName) {
            SongName = songName;
        }

        public int getMinutes() {
            return Minutes;
        }

        public void setMinutes(int minutes) {
            Minutes = minutes;
        }

        public int compareTo(Person person) {
            return this.Minutes > person.Minutes ? 1 : this.Minutes < person.Minutes ? -1 : 0;
        }

    }

}
