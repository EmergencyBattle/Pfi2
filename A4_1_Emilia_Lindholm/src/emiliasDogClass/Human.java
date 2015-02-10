package emiliasDogClass;

public class Human {

	private Dog dog;
	
	private String name; 

	public Human (String name){
		this.name = name;
		
	}
	
	public String getName(){
		
		return name;
	}
	
	public void buyDog(Dog dog){
		this.dog = dog;
		
	}
	
	/**Returns: "x owns a dog called y" or " x does not own a dog"*/ 
	public String getInfo (){
		String s = " ";
		if(dog != null){

			s = getName() +" " +"owns a dog called" + " "+ dog.getName() + ".";
			return s;

		}else{

			s = getName() + " " + "does not own a dog.";
			return s;
	}
	
	
}
}

