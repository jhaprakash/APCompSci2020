public class HelloString
{
    public static void main(String[] args) {
        System.out.println("Hello String".getClass());
        String greeting = null;
        System.out.println("Greeting: " + greeting);
        greeting = new String("Hello");
        System.out.println("Greeting: " + greeting);

        greeting = "Hello using literal";
        System.out.println("Greeting: " + greeting);

        boolean flag = true;
        int radius = 20;
        double PI = 3.142;
        String subject = "World";

        String strConcat = greeting + subject;
        String boolConcat = "state of flag: " + flag;
        String intConcat = "Radius of circle: " + radius;
        String doubleConcat = "Value of PI: " + PI;
        String area = "Area of circle: " + PI * radius * radius;
        String concatCatch = "The catch is: " + (12 + 3 + 5);

        System.out.println(strConcat);
        System.out.println(boolConcat);
        System.out.println(intConcat);
        System.out.println(strConcat);
        System.out.println(doubleConcat);
        System.out.println(area);
        System.out.println(concatCatch);

        String strQuote = "\"First, solve the problem. Then, write the code\" - John Johnson";
        System.out.println(strQuote);

        String strNewLine = "First line\nSecond line\nThird line";
        System.out.println(strNewLine);

        strNewLine = intConcat + "\n" + doubleConcat + "\n" + area;
        System.out.println(strNewLine);

        String strSpace = "This string" + " " + "is" + " " + "with " + "spaces";
        System.out.println(strSpace);

        System.out.println("This\tApart");

//        String strEscape = "How many" + "\""
        System.out.println("\\\\\\How many do you need to print 3\\?");
    }
}
