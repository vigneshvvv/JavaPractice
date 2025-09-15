package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class sample {
	
	public static void sample() {
		Integer a = 10;
		System.out.println(a);
	} 
	
	public static void main(String[] args) {
		
		Specification specification = new Specification();
//		specification.setId(1);
//		specification.setName("mobile");
//		specification.setType("Eloectronics");
//		specification.setLifetime("10Yearss");
//		specification.setNew(true);
		
		System.out.println(specification.getName());
		System.out.println(specification);
		DetailsImpl detailsImpl = new DetailsImpl();
		detailsImpl.productinCart();
		Details.insertDetail();
		
		
		AbstractImp abstractImp = new AbstractImp();
//		String output = abstractImp.testingMethod();
//		System.out.println(output);
		System.out.println(abstractImp.testingMethod());
		sample();
		int a = 10;
		String sample = "data"; 
		System.out.println(a);
		int[] num = {10,12,13,14};
		int [] num2 = {1,2,3,4};
		String[] val = {"testing","the", "java"};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num2.length; j++) {
				int c = num[i]*num2[j];
				System.out.println(c);
			}	
		}
		UserDetails user = new UserDetails(1, "v", "User", "dev", "600119", "chn", "12334");
		List <Users> details = new ArrayList<Users>();
		List <String> details3 = new ArrayList<String>();
		details3.add("sample");
		Users userNew = new Users();
		userNew.setProduct("CPU");
		userNew.setPrice("30000");
		userNew.setQuantity("2");
		Users user2 = new Users();
		user2.setProduct("RAM");
		user2.setPrice("40000");
		user2.setQuantity("2");
		details.add(userNew);
		details.add(user2);		
		for(Users user1: details) {
			System.out.println(user1.getProduct());
			
		}
//		details.remove(0);
		Set<Integer> sampleSet = new HashSet<Integer>(); 
		Set<String> sampleset2 = new HashSet<String>();
		sampleSet.add(10);
		sampleSet.add(10);
		sampleSet.add(20);
		sampleSet.add(30);
		System.out.println(sampleSet);
		List<Integer> sampleList = new ArrayList<Integer>();
		sampleList.add(10);
		sampleList.add(10);
		sampleList.add(20);
		sampleList.add(30);
		sampleList.add(40);
		System.out.println(sampleList);
		
		Map<Integer, String> userSample = new HashMap<Integer, String>();
		userSample.put(1, "sample");
		userSample.put(2, "sample2");
		userSample.get(1);
		System.out.println(userSample.get(1));
		Map<Integer, Users> sampleHash = new HashMap<Integer, Users>();
		sampleHash.put(1, userNew);
		sampleHash.put(2, user2);
		System.out.println(sampleHash.get(2));
		Map<Users, List<Users>> userSample3 = new HashMap<Users, List<Users>>();
		userSample3.put(user2, details);
	
		System.out.println(	userSample3.get(user2));
		
		user.setName("vignesh");
		
		Set<Integer> treeEx = new TreeSet<Integer>();
		treeEx.add(20);
		treeEx.add(10);
		treeEx.add(30);
		treeEx.add(5);
		System.out.println(treeEx);
		
		UserPractice practice = new UserPractice();
		Set<Integer> dataN = practice.deletingData(60, 70);
		System.out.println(dataN);
		UserPractice.addingData();
	}

}
