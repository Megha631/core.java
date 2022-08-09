/*Q1-->explain encapsulation with proper example
Encapsulation in which internal data hiding from the users.for example : laptop is an entity 
and wifi,storage,speaker are hidden.
for example-->*/
/*class Encapwork1{
	public static void main(String [] args){
      System.out.println("this is encapwork");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your Name");
      String name=sc.nextInt();
      UserName ud=new UserName();
	  System.out.println(ud.getId());
      ud.getName();
      System.out.println("the name is" + ud.getName());
      ud.setName(Name,2);
      System.out.println("the name after updation is" + ud.getName()); 
   } 
} 
  class UserName{
  public final String Name="Megha";
  int Id=2;
  void getName(String Name){
    if(checkName(Name)){
	  return Name;
	  }
	  return 0;
	  }
	  void setName(String Name,int Id){
	  if(checkName(Name)){
	   return.this.name.equals(Name);
	   }
	 }
  }*/
/*Q2->a: Access Modifiers--> 	Access specifiers  in which method or property is accesssed.they are four types:
1.public
2.private
3.protected
4.default
b:packages--> packages in which they are group of related classes.builtin packages are predefined 
and if the user made packages called user defined packages.
sub packages and classes in which all the specifiers 
c:Final keyword--> final keyword means constant value and cannot change this value again.
if final keyword  in class then class is not inherit.*/
/*Q5 pattern
     int n=4;
     for(int i=1;i<=n;i++){
	  for(int j=1;j<=n-i;j++){
		  System.out.print(" ");
	  }
	  for(int j=1;j<=i;j++){
		  System.out.print("1");
	  }
	  System.out.println();
    }
  }
 }*/
 //Q4
 /*class Rectangle{
	 public int length;
	 public int breadth;
	 static void setArea(int length){
	    this.length=length;
	   }
	    public int area(){
		 return length*2;
	   }
	  void setCircumfrance(int length, int breadth){
        this.breadth=breadth;		
	    }
		public int circumfrance(){
			return length+breadth;
    }
 }
class Shape extends Recatangle{
	public static void main(String[] args){
		
     Rectangle r=new Rectangle ();
	 r.setArea(5);
	 r.setCircumfrance(2,3);
	 System.out.println(r.getArea());
	 System.out.println(r.getCircumfrance());
	 Shape s=new Shape();
	 s.length();
	 s.breadth();
    }
 }/


