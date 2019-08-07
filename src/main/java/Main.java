import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.fasterxml.jackson.databind.ObjectMapper;


import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.*;

import java.util.Arrays;

import java.util.Scanner;


import java.util.*;



public class Main {







    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException   {
        FileInputStream fis = new FileInputStream("album.json");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        List<UserModelList> userModelLists = objectMapper.readValue(fis, typeFactory.constructCollectionType(ArrayList.class, UserModelList.class));

        System.out.println("Задано текстовий файл з інформацією про музичний альбом. Кожний запис містить прізвище виконавця, назву пісні та її тривалість. Створити відповідний клас, для зберігання інформації використати одну з колекцій; відсортувати дані за назвою пісні. Відсортовані записи вивести на екран. Передбачити обробку виключних ситуацій.");
        System.out.println("\n Before: " + userModelLists);

//---------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList<String>Words = readFromFile("album.json");
        System.out.println(Arrays.toString(Words.toArray()));
        Collections.sort(Words);
        System.out.println("\nAfter: " + Arrays.toString(Words.toArray()));

    }
       public static ArrayList readFromFile(String FileName) {

        ArrayList<String> MyList = new ArrayList<String>();


        try {
            Scanner sc = new Scanner(new File(FileName));
            while (sc.hasNextLine()) {
                MyList.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println( e + "Файл не знайдено");
        }
        return MyList;
    }


    }












