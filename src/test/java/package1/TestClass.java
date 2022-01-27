package package1;

import org.testng.annotations.Test;

public class TestClass {




    @Test
    public void test1(){
        String env=System.getProperty("env");
        System.out.println("my env variable"+env);
        System.out.println("test1");

    }


    @Test
    public void test2(){
        System.out.println("test2");

    }



}
