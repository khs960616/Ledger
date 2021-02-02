package ledger;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
	 private UserJpaRepo userJpaRepo;
	
	public List<User> getAllUser(){
		return userJpaRepo.findAll();
	}
	
	public User createUser(User userParam) {
		User user = User.builder()
				.email(userParam.getEmail())
				.password(userParam.getPassword())
				.userName(userParam.getUserName())
				.bankName(userParam.getBankName())
				.accountNumber(userParam.getAccountNumber())
				.businessNumber(userParam.getBusinessNumber())
				.build();
		return userJpaRepo.save(user);
	}
	
	public void deleteUser(Long userId) {
		User user = userJpaRepo.findById(userId).get();
		if(user==null) {
			log.info("Not Exist Error :: User");
		}
		userJpaRepo.delete(user);
	}
}
