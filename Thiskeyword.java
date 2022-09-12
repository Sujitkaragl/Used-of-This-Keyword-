public class Main {
	int code;
	String name;
	Main(){
	    this(11);
	    System.out.println("This is default Constructor ");
	}
	Main(int name){
	    this(11,"Pranil");
	    System.out.println("This is one parameter Constructor ");
	}
	Main(int code,String name){
	    this.code = code;
	    this.name = name;
	    System.out.println("This is Two parameter Constructor ");
	}
	void display(){
	    System.out.println("This is Display method ");
	    System.out.println("The Code is "+code+"\nAnd the Name is"+name);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.display(); 
			}
}
