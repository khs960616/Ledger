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
public class CompanyService {
    private  CompanyJpaRepo companyJpaRepo;
    
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
                .location(companyParam.getLocation())
                .bankId(companyParam.getBankId())
                .accountNumber(companyParam.getAccountNumber())
                .build();
        return companyJpaRepo.save(company);
    }

    public List<Company> getAllCompany(){
        return companyJpaRepo.findAll();
    }

    public void deleteCompanyById(Long companyId){
        Company company = companyJpaRepo.findById(companyId).get();
        if(company ==null){
            log.info("Not Exist Error :: company");
        }
        companyJpaRepo.delete(company);
    }

    public Company getCompanyById(Long companyId){
        return companyJpaRepo.findById(companyId).get();
    }

}