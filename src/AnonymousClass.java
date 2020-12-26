/*
* Anonymous classes are inner classes with no name. Since they have no name, we can't use them in order
* to create instances of anonymous classes.
* As a result, we have to declare and instantiate anonymous classes in a single expression at the point of use.
* We may either extend an existing class or implement an interface.
* If you want to just change the method of interface then use anonymous class
* You cant reuse the class
* */





class A {
    public void show() {
        System.out.println("I am the metod in parent class " + this.getClass());

    }
}


interface Interface
{
    void say ();

}



public class AnonymousClass {

    public static void main(String[] args) {


     // Normal object
        A obj1 = new  A();
        obj1.show();



      // An object created with an annymous class
        A obj = new A() // <- we create the

               {   // the define the class . Doing things in reverse
                   // Declaring and instating child class the same time
                   // In here you just created a new class , just like you wold other.
                   // This lets over write the the metods of the class you inherited from.
                   //  cant create new metod , only overwrite parent metod
                   public void  show ()
                   {
                       System.out.println("Hi i am new metode inside the new and unknown class " + this.getClass());
                   }
                };  // }; syntax to tell this is class and end it.


        obj.show();








        Interface oj1 = new Interface(){
                 @Override
                public void say() {

                 }};


}

}
