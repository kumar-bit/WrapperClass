class WrapperClas1{
String name;
int id;
WrapperClas1(int id,String name){
this.name=name;
this.id=id;
}
public void info(){
System.out.println("name:"+name+ "id:"+id);
}
public void info(int a,int c){
System.out.println(c+"method is overloaded" +a);
}
void info1(){
System.out.println("in parent class");
}
}

class WrapperClas{ 
public static void main(String args[]) {
int i = Integer.parseInt("10"); 
double d = Double.parseDouble("10.5"); 
long l = Long.parseLong("1111", 4);
String s = Integer.toString(15, 2);
Integer I =Integer.valueOf(10);
  
System.out.println(i); 
System.out.println(d); 
System.out.println(l); 
System.out.println(s); 
System.out.println(I);
WrapperClas1 obj1 = new WrapperClas1(10245,"Chaitanya");
WrapperClas1 obj2 = new WrapperClas1(92232,"Negan"); 
obj1.info();  
obj2.info();  
obj1.info(5,9);
}
}
