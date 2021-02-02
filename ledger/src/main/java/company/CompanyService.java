package ledger.company;


import ledger.bank.BankService;
import java.util.List;
import ledger.bank.BankService;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyJpaRepo companyJpaRepo;
    
    public Company createCompany(Company companyParam){
        
     /*   if(bankService.isBankById(companyParam.getBank())== false){
            log.info("Not Exist Error :: bank");
            return null;
        }
    */        
        Company company = Company.builder()
                .companyId(companyParam.getCompanyId())
                .companyName(companyParam.getCompanyName())
                .companyNumber(companyParam.getCompanyNumber())
                .representative(companyParam.getRepresentative())
                .resgistrationNumber(companyParam.getResgistrationNumber())
                .loaction(companyParam.getLocation())
                .bank(companyParam.getBank())
                .accountNumber(companyParam.getAccountNumber())
                .build();
        return companyJpaRepo.save(company);
    }

    public List<Company> getAllCompany(){
        return companyJpaRepo.findAll();
    }

    public void deleteCompany(Long companyId){
        if(companyJpaRepo.findById(companyId).get()==null){
            log.info("Not Exist Error :: company");
        }
        companyJpaRepo.delete(companyId);
    }

    public Company getCompanyById(Long companyId){
        return companyJpaRepo.findById(companyId).get();
    }

}