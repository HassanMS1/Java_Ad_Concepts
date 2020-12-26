import java.sql.SQLOutput;

public class StringImmutable {

    // This class will prove string immutability.
    // Strings are object in the java that cant be changed only the reference can be point another object
    // Warning : The value returned by hashCode() is by no means guaranteed to be the memory address of the object



    public static void referenceCheck(Object x, Object y) {
        if (x == y) {
            System.out.println("Both objects points to same reference");

        } else {
            System.out.println("Both pointing to different object");
        }
    }

    public static void main(String[] args) {

        String orignalString= "Hassan";
        String copyString = orignalString; // copying the string of the orignal name, means it point same object

        System.out.println("Are string name2 and name the same object ? Here is the hash code:  " );
        //  both variable point to the same string in the pool

        System.out.println("The hashcode of the " + orignalString.hashCode() +" = " +copyString.hashCode() + ". They are same");
        // Change the first the orignal string and see if the it changes the copy of the string by adding a letter and
        // and see what happens with old string and if hash code changes for the orginal string

        orignalString = orignalString.concat("s");  // adding a letter to orignal string
        orignalString=orignalString.replace("n","m");
        System.out.println("Hash code of the orginal string has changed : Original and hash code; " + orignalString+" "+ orignalString.hashCode());
        System.out.println("The copy string points to the old object still: " + copyString +" +" +copyString.hashCode());



        // further proves




        String s1 = "java";
        String s2 = "java";

        System.out.println("No modification is made");

        referenceCheck(s1,s2);

        s1 = s1.concat("code");

        System.out.println("After modification");

        referenceCheck(s1,s2);



        /*
        String firstString = "coderolls";
        String secondString = "javablog";
        String thirdString = "coderolls";

        // creating new String object with the same value as firstString or thirdString
        String fourthString =  new String("coderolls");

        System.out.println("Comparing strings using == operator \n");

        System.out.print("firstString == secondString : ");
        System.out.println(firstString == secondString);

        /*
         * Here firstString and thirdString is referring to the same String object
         * hence it will print 'true'.

        System.out.print("firstString == thirdString : ");
        System.out.println(firstString == thirdString);
        */



    }

}
