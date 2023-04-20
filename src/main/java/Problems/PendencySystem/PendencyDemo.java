package Problems.PendencySystem;

import java.util.Arrays;
import java.util.List;

public class PendencyDemo {

    public void Demo(){
        try {
            PendencySystem pendencySystem = new PendencySystem();
            List<String> tags1 = Arrays.asList("UPI", "Karnataka", "Bangalore");
            List<String> tags2 = Arrays.asList("UPI", "Karnataka", "Mysore");
            List<String> tags3 = Arrays.asList("UPI", "Rajasthan", "Jaipur");
            List<String> tags4 = Arrays.asList("Wallet", "Karnataka", "Bangalore");

            pendencySystem.startTracking(1112, tags1);
            pendencySystem.startTracking(2451, tags2);
            pendencySystem.startTracking(3421, tags3);
            pendencySystem.startTracking(1221, tags4);


            List<String> search1 = Arrays.asList("UPI");
            List<String> search2 = Arrays.asList("UPI", "Karnataka");
            List<String> search3 = Arrays.asList("UPI", "Karnataka", "Bangalore");
            List<String> invalidHierarchy = Arrays.asList("Bangalore");


            System.out.println(search1 + ":" + pendencySystem.getCounts(search1));
            System.out.println(search2 + ":" + pendencySystem.getCounts(search2));
            System.out.println(search3 + ":" + pendencySystem.getCounts(search3));
            System.out.println("invalid hierarchy: ");
            System.out.println(invalidHierarchy + ":" + pendencySystem.getCounts(invalidHierarchy));


            pendencySystem.stopTracking(1112);
            pendencySystem.stopTracking(2451);

            System.out.println();
            System.out.println("### AFTER STOPPING ###");
            System.out.println();


            pendencySystem.startTracking(4221, Arrays.asList("Wallet", "Karnataka", "Bangalore"));


            System.out.println(search1 + ":" + pendencySystem.getCounts(search1));
            System.out.println(Arrays.asList("Wallet") + ":" + pendencySystem.getCounts(Arrays.asList("Wallet")));
            System.out.println(search3 + ":" + pendencySystem.getCounts(search3));



            System.out.println("### Some New Tags ###");

            pendencySystem.startTracking(3221, Arrays.asList("UPI", "Karnataka#Bangalore"));

            pendencySystem.getCounts(Arrays.asList("UPI", "Karnataka" , "Bangalore"));

        }catch (InvalidTrackingIdException e) {

            System.out.println(e.getMessage());
        }
    }
}
