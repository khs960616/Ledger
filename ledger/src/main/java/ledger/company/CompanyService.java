package ledger.company;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {
	private final CompanyJpaRepo companyJpaRepo;
	
	public List<Company> getCompanyList(){
		return companyJpaRepo.findAll();
	}
	
	public Company addCompanyInfo(Company param) {
		Company company = Company.builder()
				.name(param.getName())
				.number(param.getNumber())
				.representative(param.getRepresentative())
				.bankName(param.getBankName())
				.accountNumber(param.getAccountNumber())
				.registrationNumber(param.getRegistrationNumber())
				.location(param.getLocation())
				.build();
		return companyJpaRepo.save(company);
	}
	
	public void deleteCompanyInfo(Long id) {
		Company company = companyJpaRepo.findById(id).get();
		if(company==null) {
			log.info("Not Exist Error :: User");
		}
		companyJpaRepo.delete(company);
	}
}
