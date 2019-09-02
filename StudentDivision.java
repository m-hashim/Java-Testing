package Test;

public class StudentDivision{
	String Division(int a, int b, int c){
		String str ="";
		int avg = a+b+c;
		avg/=3;
		
		if(avg>=60){
			str ="First Division";
		}else if(avg>=50){
			str="Second Division";
		}else if(avg>=40){
			str="Third Division";
		}else{
			str="Fails";
		}
		return str;
	}
	
	public static void main(String args[]) {
		int a[] = {0,1,99,100};
		StudentDivision sd = new StudentDivision();
		sd.Division(50,50,50);
		for(int i=0;i<4;i++){
			sd.Division(a[i],50,50);
			sd.Division(50,a[i],50);
			sd.Division(50,50,a[i]);
		}
	}
}
