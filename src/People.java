import java.util.Objects;

public class People {

    String name ;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // The original equals method  is coming from generic object
    // Objects class cannot accesss your class data therefor it cant compare
    // therefore every new class will return different equals

    // naturally equals only compares the addresse but when changed you compare the data

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

         People other = (People) obj;
         return this.age==other.age && this.name.equals(other.name);

    }

    // hashcode is not the address, rather hashcode is convert to hexadecimal
    //tooString returns object plus hex number of hashcode: People@8cd1117e
    // hashcode -1932455554 converted to hex is 8cd1117e


    // if you change equal method also change hashcode method, so that if you want to use hashset later
    // every hashcode is created properly based and placed in the correct bucket
    // the hashCode will create hashcode based object data, sometimes different object can have same hashcode
    // a bucket will have objects with hashcode and ignore if the object are same
    @Override
    public int hashCode() {
        // this implemetation will make sure same object will create same hashcode
        // if you dont do this , duplicate objects will create different hashcode
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {

        People p1 = new People("Hassan", 35);
        People p2 = new People("Hassan", 35);
        System.out.println(p1.equals(p2));
        System.out.println(p1 + " " + p1.hashCode());
        System.out.println(p2 + " " + p2.hashCode());




    }
}
