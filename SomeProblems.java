package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeProblems {

    Map<String, String> lastnameFirstname = new HashMap<>();

    Map<String, List<String>> mapContainingDuplicate = new HashMap<>();

    public static void main(String[] args) {
        SomeProblems problems = new SomeProblems();


        problems.lastnameFirstname.put("sharma", "alok");
        problems.lastnameFirstname.put("singh", "kaushal");
        problems.lastnameFirstname.put("kumar", "rahul");
        problems.lastnameFirstname.put("verma", "amit");
        problems.lastnameFirstname.put("gupta", "ravi");
        problems.lastnameFirstname.put("mehta", "suresh");
        problems.lastnameFirstname.put("patel", "jay");
        problems.lastnameFirstname.put("chaddha", "rohit");
        problems.lastnameFirstname.put("salvi", "amit");
        problems.lastnameFirstname.put("shah", "rahul");

        //Write a program to find surnames  who have common firstname
        //For example: amit is common in verma and salvi
        /*
         * Expected output:
         * amit: verma, salvi
         *
         */





        problems.mapContainingDuplicate.put("sharma", List.of("fan", "desk", "chair"));
        problems.mapContainingDuplicate.put("singh", List.of("sofa", "bed", "lamp"));
        problems.mapContainingDuplicate.put("kumar", List.of("stool", "shelf", "drawer"));
        problems.mapContainingDuplicate.put("verma", List.of("couch", "wardrobe", "mirror"));
        problems.mapContainingDuplicate.put("gupta", List.of("bench", "cupboard", "rack"));
        problems.mapContainingDuplicate.put("mehta", List.of("table", "fan", "chair"));
        problems.mapContainingDuplicate.put("patel", List.of("desk", "cabinet", "almirah"));
        problems.mapContainingDuplicate.put("chaddha", List.of("wardrobe", "lamp", "closet"));

        //Write a program to find names of people who have same items in their list
        /// For example: sharma and mehta have fan and chair in their list
        /*
         * Expected output:
         * desk: sharma, patel
         * chair: sharma, mehta
         * wardrobe: verma, chaddha
         */





    }

}
