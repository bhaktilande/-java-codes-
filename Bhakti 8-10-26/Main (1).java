class Student {
  String name;
  int age;
}
public class Main {
   public static void main(String[] args) {
     Student s1 = new Student();
     Student s2 = s1;
     s1.name = "Bhakti";
     System.out.println("The name is:" + s1.name);
     System.out.println(s2.name);

     s1 = null;
     System.out.println(s1);
     System.out.println(s2.name);
   }
}
     

  
