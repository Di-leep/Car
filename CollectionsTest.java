package mvpcorejava;
import java.util.ArrayList;
public class CollectionsTest {
	public static void main(String[] args) {
        
		ArrayList<String> cars= new ArrayList<>();
        System.out.println("start");
        System.out.println("no data was given ---->"+cars.isEmpty()); //isEmpty
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Kia");
        cars.add("Volvo");
        cars.add("Tata");
        System.out.println("no data was given ---->"+cars.isEmpty());
       System.out.println("total brand---->"+cars.size());         //size of list
       System.out.println("before removing by obj---->"+cars);
       cars.remove("Kia");                                         //removing by object
       System.out.println("After removing by obj---->"+cars);
       System.out.println("before removing by index--->"+cars);
       cars.remove(0);                                              //removing by index
       System.out.println("after removing by index----->"+cars);
       System.out.println("After removing first obj the size will be---->"+cars.size());     //after removing size of list
       System.out.println("before replacing data--->"+cars);
       cars.set(4, "MG Motors");                                              //replace or update by using set
       System.out.println("after replacing data---->"+cars);
       System.out.println("before adding by index and obj---->"+cars);
       cars.add(3, "Tesla");
       System.out.println("after adding by index and obj-----> "+cars);
       System.out.println("geting data in list by index---->"+cars.get(3)); //getting data by using index number
       System.out.println("is list contains this brand--->"+cars.contains("Tesla")); //it will so whether the given data is there or not
       System.out.println("Is list contains this brand--->"+cars.contains("Tata"));
       //System.out.println("before using clear size of the list--->"+cars.size());
       //cars.clear();                                                                  //it will clear all data
       //System.out.println("after using clear size of the list---->"+cars.size());
       
       ArrayList<String> bikes= new ArrayList<>();
       bikes.add("Honda");
       bikes.add("Hero");
       bikes.add("KTM");
       bikes.add("RE");
       bikes.add("Yamaha");
       bikes.add("bajaj");
       bikes.add("Tvs");
       bikes.add("BMW");
     // System.out.println("before using addAll by index and obj---->"+cars); 
     // cars.addAll(3, bikes);                                                        //addAll(index,string) was used to add both list and index will give order where place the data
     // System.out.println("after using addAll by index and obj---->"+cars);
       System.out.println("before addAll--->"+cars);
      cars.addAll(bikes);                                            //add both a list but it will add after first list 
      System.out.println("after addAll--->"+cars);
      
      System.out.println("before retainAll--->"+cars);
       cars.retainAll(bikes);                                        //it will show common data in collections
       System.out.println("after retainAll--->"+cars);
       
       cars.removeAll(bikes);                        //it will remove all data form collections 
       System.out.println(cars);
       
  
       
	}

}
