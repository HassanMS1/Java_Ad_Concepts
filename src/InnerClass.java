import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

class OuterClass{
    public void say (){
        System.out.println("Outer Class");
    }

    class innerClass{
        public void say (){
            System.out.println("Inner class");
        }
    }


}


public class InnerClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();

        // to create and object of inner classes you Outer.innerclass and
        OuterClass.innerClass objInnerClass = obj.new innerClass();
        objInnerClass.say();

    }
}
