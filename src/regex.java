import java.util.regex.*;
public class regex {
    public static void main(String[] args){
            //1st way
            Pattern p=Pattern.compile(".s");        //.represents single character
            Matcher m=p.matcher("as");
            boolean b1=m.matches();
            System.out.println(b1);



            //2nd way
            //boolean b2=Pattern.compile(".s").matcher("as").matches();
            //System.out.println(b2);




            //3rd way
            //boolean b3=Pattern.matches(".com",".acom");
            //System.out.println(b3);
        }
    }

