package week3.day1;



public class Mobile {
	/*- Mobile (methods: sendMsg(),makeCall(),saveContact() 
	- AndroidPhone (method: takeVideo)
	- SmartPhone (method: connectWhatsApp)
	Note:
	- AndroidPhone extends Mobile (Single Level Inheritance)
	- SmartPhone extends AndroidPhone ( Multilevel Inheritance)
	Execution class:
	- Create a class named MyPhone for execution ( must have a main method)
	- First, Create an object for AndroidPhone 
	  Observe what all methods can be accessed ( Single Level Inheritance)
	- Then, Create object for SmartPhone class 
	   Observe if you can call all the methods using this object ( Multilevel Inheritance)package week3.day1;*/
public  void sendMsg()
{
System.out.println("Send message");
}
public  void makeCall()
{
System.out.println(" make call");

}
public void  saveContact()
{
	System.out.println("save contact");
}
}


