package CoreJava.Generics;


/**
 * generics are used to handle different data type
 * and remove code duplication for different datatype / object
 *
 * Generics is one class which is flexible for multiple datatypes
 *
 */
public class GenericsDemo <T> {

    T genericObject;

    public GenericsDemo(T genericObject) {
        this.genericObject = genericObject;
    }

    public void  printObject() {
        System.out.println(genericObject);
    }
}
