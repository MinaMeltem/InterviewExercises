package nyc.c4q.meltemyildirim;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Exer1 exer1 = new Exer1();
        System.out.println(exer1.wordToArray("ILoveJava"));  //ILoveJava

        Exer2 exer2 = new Exer2();
        System.out.println(exer2.truncate("Hello",3)); //Hel...

        Exer3 exer3 = new Exer3();
        System.out.println(exer3.checkUnique("Mel")); //true

        Exer4 exer4 = new Exer4();
        System.out.println(exer4.elide("Hello!")); //Hello!
        System.out.println(exer4.elide("Hello, world!")); //Hel...!
        System.out.println(exer4.elide("That's not my name.")); //Tha....

        Exer5 exer5 = new Exer5();
        System.out.println(exer5.xToNum(4, 8)); //30

        Exer6 exer6 = new Exer6();
        String [] arr1 = {"arya", "sansa", "bran"};
        String [] arr2 = {"daenerys", "tyrion", "jon"};
        System.out.println(exer6.stringArrays(arr1, arr2)); //arya, sansa, bran, daenerys, tyrion, jon,

        Exer7 exer7 = new Exer7();
        System.out.println(exer7.isRotated("waterbottle","erbottlewat" )); //returns true);
        System.out.println(exer7.isRotated("waterbottle","bottlerewat" )); //returns false
        System.out.println(exer7.isRotated("dragon","agondr" )); //returns true
        System.out.println(exer7.isRotated("dragon","dog")); //returns false


        Exer8 exer8 = new Exer8();
        System.out.println(exer8.decode("0001111")); //[3, 4]
        System.out.println(exer8.decode("000111100001")); // [7, 5]
    }
}
