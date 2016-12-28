
package collection;

public class Person {
    public String name;
    public int age;
    public boolean gender;
    public boolean solder;

public Person()
{
    name = "";
    age = 0;
    gender = false;
    solder = false;
}
    public Person(String tName, int tYear, boolean tGender, boolean tSolder)
    {
        name = tName;
        age = tYear;
        gender = tGender;
        solder = tSolder;
    }
    public void setName(String tName){
        name = tName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int tYear){
        age = tYear;
    }
    public int getAge(){
        return age;
    }
    public void setGender(boolean tGender){
        gender = tGender;
    }
    public boolean getGender(){
        return gender;
    }
    public void setSolder(boolean tSolder){
        solder = tSolder;
    }
    public boolean getSolder(){
        return solder;
    }
    /*public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Year: " + age);
        if(gender)
            System.out.println("Gender: male");
        else
            System.out.println("Gender: female");
        if(gender == true && age >= 18)
            System.out.println("Army: yes");
        else
            System.out.println("Army: no");
        System.out.println("");
    }*/
}