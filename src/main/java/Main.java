

import java.lang.Package;
import com.rmd.animals.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        dog d = new dog();
        d.set_name("Bob");
        System.out.println("animal name: " + d.get_name());

        Package objPackage = d.getClass().getPackage();

        objPackage = com.rmd.animals.dog.class.getPackage();

        //examine the package object
        String name = objPackage.getSpecificationTitle();
        String version = objPackage.getSpecificationVersion();
        //some jars may use 'Implementation Version' entries in the manifest instead

        System.out.println("Package name: " + name);
        System.out.println("Package version: " + version);

    }

    public void readVersionInfoInManifest(){

        //build an object whose class is in the target jar
//        InternetAddress object = new InternetAddress();
//
//        //navigate from its class object to a package object
//        Package objPackage = object.getClass().getPackage();
//
//        //examine the package object
//        String name = objPackage.getSpecificationTitle();
//        String version = objPackage.getSpecificationVersion();
//        //some jars may use 'Implementation Version' entries in the manifest instead
//
//        System.out.println("Package name: " + name);
//        System.out.println("Package version: " + version);
    }

}
