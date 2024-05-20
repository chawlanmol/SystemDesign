package CoreJava.Optional;


import com.signalfx.shaded.apache.commons.lang3.StringUtils;

import java.util.Optional;



/**
 * Optional is container which can or can not contain the object
 *
 * Optional may or may not have the value
 */

public class OptionalTutorial {


    public  void OptionalTutorialDemo() {

        Optional<Cat> optional  = findCat("fred");

        // is present to check if there is a value in the optional or else return null
        if(optional.isPresent()) {
            System.out.println(optional.get().name);
        }

        // we can also use OptionalCat or else
        Cat myCat = optional.orElse(new Cat("default Cat"));

        //Optional or else get
        Cat mycat = optional.orElseGet(() -> new Cat("default lambda"));


        // Optional or Throw


    }

    /**
     * by returning optional to user it conveys that value can be null
     *
     * @param name
     * @return
     */
    private static Optional<Cat> findCat(String name) {

        Cat myCat = new Cat("Fred");

        return Optional.of(myCat);
    }

    /**
     * uses nullable if or Object can be null
     * @param name
     * @return
     */
    private static Optional<Cat> findCatNullable(String name) {
        Cat myCat = null;
        if(StringUtils.isNotEmpty(name)) {
             myCat = new Cat("Fred");
        }
        // Optional Of can not take a null value
        // if value can be null then Optional.ofNullable
        return Optional.ofNullable(null);
    }
}
