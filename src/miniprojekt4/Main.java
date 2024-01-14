package miniprojekt4;

public class Main {

    public static void main(String[] args) {

        MultiHashMap map = new MultiHashMap<String, String>();
        map.addValue("Marcus", "Larsson");
        map.addValue("Marcus", "Thomas");
        //gib mir random Strings zum einfügen
        map.addValue("test", "test");
        map.addValue("test", "test2");
        map.addValue("test", "test3");
        map.addValue("test", "test4");
        map.addValue("test", "test5");
        map.addValue("test", "test6");
        map.addValue("test2", "test6");
        map.addValue("test2", "test5");
        map.addValue("test2", "test4");
        map.addValue("test2", "test3");
        map.addValue("test2", "test2");
        map.addValue("te=st=2", "test1");
        map.addValue("test2", "test0");
        map.addValue("bbb", "aa");

        System.out.println(map);
        

        String input = "KE=Y = Val=ue=1,= =va=lu=e2, value3, value4";
        String input2 = "KEY = Value1";
        String input23 = "KEY = Value1, value2, value3, value4";
        String input234 = "KEY = Value1, value2, value3, value4";
        String input2345 = "KEY = Value1, value2, value3, value4";

    }
}
