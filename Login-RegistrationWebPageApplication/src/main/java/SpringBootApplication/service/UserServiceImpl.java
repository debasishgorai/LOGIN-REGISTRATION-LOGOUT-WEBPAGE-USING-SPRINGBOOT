package SpringBootApplication.service;

import org.springframework.beans.factory.annotation.Autowired;

import SpringBootApplication.entities.User;
import SpringBootApplication.repository.UserRepository;

public class UserServiceImpl implements UserService {
@Autowired
	private UserRepository userRepository;
	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		try {
			userRepository.save(user);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
		
	}
//	@Override
//	public User loginUser(String email,String password) {
//		return null;
//	}
	@Override
	public User loginUser(String email, String password) {
		// TODO Auto-generated method stub
		//User validuser=userRepository.findByEmail(email);
		User validuser=userRepository.findByEmail(email);
		if(validuser!=null && validuser.getPassword().equals(password)) {
			return validuser;
		}
	return null;
	}
	
	

}
