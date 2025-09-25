package stream;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class mainClass {
	
	public static void main(String[] args) {
		
		UserData userData = new UserData();
		userData.setId(1);
		userData.setUserName("user");
		userData.setLastName("null");
		userData.setRole("SW");
		userData.setExperience("5");
		userData.setMobileNo("1234");
		
		UserData userData1 = new UserData();
		userData1.setId(1);
		userData1.setUserName("user1");
		userData1.setLastName("null");
		userData1.setRole("Devops");
		userData1.setExperience("5");
		userData1.setMobileNo("1234");
		
		UserData userData2 = new UserData();
		userData2.setId(1);
		userData2.setUserName("user2");
		userData2.setLastName("null");
		userData2.setRole("Tester");
		userData2.setExperience("5");
		userData2.setMobileNo("1234");
		
		UserData userData3 = new UserData();
		userData3.setId(1);
		userData3.setUserName("user");
		userData3.setLastName("null");
		userData3.setRole("SW");
		userData3.setExperience("3");
		userData3.setMobileNo("1234");
		
		UserData userData4 = new UserData();
		userData4.setId(1);
		userData4.setUserName("user");
		userData4.setLastName("null");
		userData4.setRole("CloudEngineer");
		userData4.setExperience("3");
		userData4.setMobileNo("1234");
		
		List<UserData> userDatas = new ArrayList<UserData>();
		
		userDatas.add(userData);
		userDatas.add(userData1);
		userDatas.add(userData2);
		userDatas.add(userData3);
		userDatas.add(userData4);
		
	List<String> userStream =	userDatas.stream().filter((e) -> e.getExperience() == "5").map((user) -> user.getUserName()).collect(Collectors.toList());
	
	List<String> userStream1 = userDatas.stream().filter((e) -> e.getExperience() == "5").map(UserData :: getUserName).collect(Collectors.toList());
	System.out.println(userStream);
	System.out.println(userStream1);

	Map<String, List<UserData>> usersFiltered= userDatas.stream().collect(Collectors.groupingBy(UserData :: getRole));
	System.out.println(usersFiltered);
	
	
	Set<String> role = new HashSet<String>();
	
	for(UserData user: userDatas) {
		role.add(user.getRole());
	}
	
	
	List<UserData> userdataSample = new ArrayList<UserData>();
	
	Map<String, List<UserData>> finalOutput = new HashMap<String, List<UserData>>();
	for(String rl: role) {
		
		for(UserData user: userDatas) {
			userdataSample = new ArrayList<UserData>();
			if(rl == user.getRole()) {
				userdataSample.add(user);
			}
		}
		finalOutput.put(rl, userdataSample);
	}
	
	System.out.println(finalOutput);
	
	}
	
	

}
