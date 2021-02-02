package ledger;
import java.util.List;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@Api(tags= {"3.  은행관리"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value ="/v3")
public class BankController {

    private  BankService bankService;

    @ApiOperation(value = "전체 은행 목록")
    @GetMapping(value = "/bank/findAll")
    public List<Bank> getAllBank(){
        return bankService.getAllBank();
    }

    @ApiOperation(value ="특정 은행 찾기 " )
    @GetMapping(value = "/bank/{find}")
    public Bank getBank(@PathVariable("find") Long bankId){
        return bankService.getBankById(bankId);
    }

    @ApiOperation(value ="은행 목록 추가")
    @PutMapping(value = "/bank")
    public Bank addBank(@ModelAttribute Bank bankParam){
        return bankService.createBank(bankParam);
    }
}