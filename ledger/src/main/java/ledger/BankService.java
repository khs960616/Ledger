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
public class BankService {
    private BankJpaRepo bankJpaRepo;
  
    public List<Bank> getAllBank(){
        return bankJpaRepo.findAll();
    }
    
    public Bank getBankById(Long bankId){
        return bankJpaRepo.findById(bankId).get();
    }
   public boolean isBankById(Long bankId){
    Bank bank = bankJpaRepo.findById(bankId).get();
        if(bank==null)
            return false;
        return true;
    }

    public Bank createBank(Bank bankParam){
        Bank bank = Bank.builder()
                .bankId(bankParam.getBankId())
                .bankName(bankParam.getBankName())
                .build();
        return bankJpaRepo.save(bank);
    }
/*public List<int> findIdbyName(string bankName){
        List<int> listId = bankJpaRepo.findByBankName(bankName).getBankId();

       
    }*/
    public void deleteBankById(Long bankId ){
        Bank bank = bankJpaRepo.findById(bankId).get();
		if(bank==null) {
			log.info("Not Exist Error :: bank");
		}
		bankJpaRepo.delete(bank);
    }

}