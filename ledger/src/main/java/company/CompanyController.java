package ledger.company;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.RequiredArgsConstructor;

@Api(tags= {"4.  회사관리"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value ="/v4")
public class CompanyController{
    private final CompanyService companyService;

    @ApiOperation(value = "전체 회사 목록")
    @PostMapping(value = "/compay/findAll")
    public List<Company> findAllCompany(){
        return companyService.getAllCompany();
    }

    @ApiOperation(value ="회사 삭제")
    @PostMapping(value = "/company/delete")
    public void deleteCompany(Long companyId){
        companyService.deleteCompany(companyId);
    }

    @ApiOperation(value = "회사 찾기")
    @PostMapping(value = "/company/findById")
    public Company findCompany(Long companyId){
        return companyService.getCompanyById(companyId);
    }
}