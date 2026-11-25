import java.util.Locale;

public class DemoString {
    static void main(String[] args) {
        String name = " Sanika";
        System.out.println( name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.length());
        System.out.println(name.equals("Sanika"));
        System.out.println(name.equalsIgnoreCase("Sanika"));
        System.out.println(name.concat("deokate"));
        System.out.println(name.contains("r"));
        System.out.println(name.substring(1,3));
        System.out.println(name.indexOf('s'));
        System.out.println(name.trim());
        System.out.println(name.replace('a','*'));
        System.out.println(name.isEmpty());
        StringBuilder name1 = new StringBuilder();
        name1.append("Sagar");
        System.out.println(name1);
        name1.reverse();
        System.out.println(name1);



    }
}
