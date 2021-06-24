package oops;

public interface ABCD {
	int k=20;
default void run(){
	System.out.println("**************");
}
void run1();  // bydefault compiler consider method as public abstract
}
