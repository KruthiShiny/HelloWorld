public class Student {
      int rollno;
      String name;
      static String college="mgt";
      static void change()
      {
          college="mgit";
      }
      Student(int r,String n)
      {
            rollno=r;
            name=n;
      }
      void display()
      {
          System.out.println(rollno+" "+name+" "+college);
      }
}
