/**
* Geekbrains. Java 1. Homework #5
*
* @author Ryabov Maxim
* @version 02.03.2022
*/

class HomeworkFive {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Ivanov Ivan", "Engineer", "ivivan@list.ru", "89146589635", 30000, 30),
            new Person("Burunov Sergey", "Actor", "burunoff@pisem.net", "89111112233", 100000, 44),
            new Person("Evdokimov Sergey", "Energetic", "evdokimovsn@mail.ru", "89046698534", 30000, 40),
            new Person("Kuzmenko Vyacheslav", "Security", "kuzmenkov@yandex.ru", "89261469875", 35000, 50),
            new Person("Kulkova Yulia", "Manager", "kulkova13@yandex.ru", "89527659984", 35000, 45)
        };
        
        for(Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String name;
    private String prof;
    private String mail;
    private String phone;
    private int cashe;
    private int age;
       
    public Person(String name, String prof, String mail, String phone, int cashe, int age) {
        this.name = name;
        this.prof = prof;
        this.mail = mail; 
        this.phone = phone;
        this.cashe = cashe;
        this.age  = age; 
    }
    
    public int getAge() {
        return age;    
    }
    
    @Override
    public String toString() {
        return name + ", " + prof + ", " +  mail + ", " + phone + ", " + cashe + ", " + age;
    } 
}