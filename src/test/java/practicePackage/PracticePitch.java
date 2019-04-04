package practicePackage;

import java.util.HashMap;

public class PracticePitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 	
		String test=null;	
		String[] strArray=null;
		String chr="f";
		int count=0;
		
		test="c,d,f,f,g,g,c";
		strArray=test.split(",");
		
	
		int sizecalResult=sizecal(chr, strArray, count);
		int directCalResult=directCal(chr, strArray, count);
		System.out.println("sizecalResult "+sizecalResult);
		System.out.println("directCalResult "+directCalResult);

		
		
	}
	
	
	public static int sizecal(String chr,String[] refArray,int count){
		long time_1 = System.nanoTime();
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		int key=101;
		
		hm.put(key, chr);
		
		for (int i = 0; i < refArray.length; i++) {
			if (refArray[i].contains(chr)) {
				key=key+1;
				hm.put(key, chr);
			}
		}
		
		
		long time_2 = System.nanoTime();	
		System.out.println("Time taken by size cal in nano sec " +( time_2-time_1));
		
		
		return hm.size()-1;
		
	}
	
	public static int directCal(String chr,String[] refArray,int count){
	
		long time = System.nanoTime();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put(chr,count);
		
		for (int i = 0; i < refArray.length; i++) {
			
			 if(hm.containsKey(refArray[i])){
				 count=count+1;
				 hm.put(chr, count); 
			 }
			
			
		}  
			
		   
		long time2 = System.nanoTime();	
		System.out.println("Time taken by directCal in nano sec " +( time2-time));
		
		return hm.get(chr);
		
	}
	
	
	
	

}
