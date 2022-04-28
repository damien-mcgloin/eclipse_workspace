package polyTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Class1 myClass1 = new Class1();
			Class1b myClass1b = new Class1b();
			Class1c myClass1c = new Class1c();
			Class2 myClass2 = new Class2();
			
			
			Class1[] class1Array = new Class1[4];
			
			class1Array[0] = myClass1;
			class1Array[1] = myClass1b;
			class1Array[2] = myClass1c;
			class1Array[3] = myClass2;
			
			class1Array[0].sayHello();
			class1Array[1].sayHello();
			class1Array[2].sayHello();
			class1Array[3].sayHello();
			
			System.out.println();
			
			for(int count=0;count<4;count++){
				class1Array[count].sayHello();
			}	
			
			Class2 myNewClass2 = (Class2)class1Array[3];
			System.out.println(myNewClass2.getMyValue());		
			
	}

}
