package demoooo;
class override{
	Object dis(String  name){
		System.out.println("hello");
        return name;
	}
	

  public void run(){
	  System.out.println("private method cannot  override");
  }
   protected void run1(){
	   System.out.println("check the possibily of override");
   }
   Number  display(){
	   return 2;
	   
   }
   // u cannot override final method if u declare final means u cant change the value of it
//   final Number dis1(){
	   Number dis1(){
	   return 22;
   }
   
}

public class runtime_polymorphism_demo extends override{
	String dis(String name){
		return name;
	}
	
	// its thrown an error because access modifier that used in parent class run method is more accessible than child class
	// public is more accessible than synchronized thats why its thrown an error
	// synchronized void run(){  
	public void run(){
		System.out.println("hii");
	}
	
	// protected is more accessible than default thats why its thrown an error
//	 void run1(){
	public void run1(){
		System.out.println("answer is given");
	}
	Integer display(){
		return 3;
	}
	Float dis1(){
		return 3f;
	}
	public static void main(String args[]){
		runtime_polymorphism_demo rpd=new runtime_polymorphism_demo();
		System.out.println(rpd.dis("pranay"));
		rpd.run();
		rpd.run1();
		System.out.println(rpd.display());
		System.out.println(rpd.dis1());

		override r=new override();
		r.run();
		r.run1();
		System.out.println(r.display());
	}

}
