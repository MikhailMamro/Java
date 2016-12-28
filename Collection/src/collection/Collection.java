package collection;

import java.util.LinkedList;
//import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
       LinkedList<Person> person = new LinkedList<>();
       person.add(new Person("Иванов", 18, true, true));
       person.add(new Person("Сидоров", 28, true, true));
       person.add(new Person("Петрова", 25, false, true));
       person.add(new Person("Краснова", 19, false, true));
      // System.out.printf("В списке %d элементов \n", person.size());
      /* for(Person p : person){
            p.printInfo();
         }*/
       List<Person> myStream = person.stream().filter(n -> n.getAge() >= 18 &&
        n.getAge() < 28 &&  n.getGender() == true).collect(Collectors.toList());
       
       
       System.out.println("Подлежат призыву: ");
       myStream.forEach(n -> System.out.println(n.getName()));
    }
    }
    
