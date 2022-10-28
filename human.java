package mvpcorejava;
public class human {
 String name;          //instance variable
 int age;
 String Sex;
 static String nationality;
 String mothertongue;
 String state;
 int height;
 int weight;
 public static void main(String[] args) {
	  human p1 = new human();
      human p2 = new human();
      human p3 = new human();
             //person 1
      p1.name = "pradeep";
      p1.age = 23;
      p1.Sex = "male";
      p1.mothertongue ="telugu";
      p1.state ="tamil nadu";
      p1.height = 170;
      p1.weight = 60;
      p1.nationality ="indian";    //static variable
             //person 2
      p2.name = "arun";
      p2.age = 25;
      p2.Sex = "male";
      p2.mothertongue ="tamil";
      p2.state = "tamil nadu";
      p2.height = 150;
      p2.weight = 56;
             //person 3
      p3.name = "manisha";
      p3.age = 20;
      p3.Sex = "female";
      p3.mothertongue = "hindi";
      p3.state = "maharashtra";
      p3.height = 145;
      p3.weight = 53;
      
      System.out.println("person 1");
      System.out.println("Name :"+p1.name);
      System.out.println("Age :"+p1.age);
      System.out.println("Natinality:"+p1.nationality);
      System.out.println("Sex :"+p1.Sex);
      System.out.println("Mother Tongue :"+p1.mothertongue);
      System.out.println("State :"+p1.state);
      System.out.println("Height :"+p1.height);
      System.out.println("Weight :"+p1.weight);
      
      System.out.println("person 2");
      System.out.println("Name :"+p2.name);
      System.out.println("Age :"+p2.age);
      System.out.println("Nationality :"+p2.nationality);
      System.out.println("Sex :"+p2.Sex);
      System.out.println("Mother Tongue :"+p2.mothertongue);
      System.out.println("state :"+p2.state);
      System.out.println("Weight :"+p2.weight);
      System.out.println("Height :"+p2.height);
      
      System.out.println("person 3");
      System.out.println("Name :"+p3.name);
      System.out.println("Age :"+p3.age);
      System.out.println("Nationality :"+p3.nationality);
      System.out.println("Sex :"+p3.Sex);
      System.out.println("Mother Tongue :"+p3.mothertongue);
      System.out.println("State :"+p3.state);
      System.out.println("Height :"+p3.height);
      System.out.println("Weight :"+p3.weight);
      
      
	}

}
