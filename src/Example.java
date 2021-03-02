import java.util.Scanner;
public class Example
{
        int id;
        String name;
        public Example(String i,int j )
        {
            name=i;
            id=j;
        }
        public static void main(String[] args)
        {
            Example e=new Example("kruthi",39);

            System.out.println(e.name+" "+e.id);
        }


}