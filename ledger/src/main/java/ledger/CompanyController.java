package ledger;
import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private  CompanyService companyService;

    @ApiOperation(value = "전체 회사 목록")
    @GetMapping(value = "/compay/findAll")
    public List<Company> findAllCompany(){
        return companyService.getAllCompany();
    }

    @ApiOperation(value ="회사 삭제")
    @DeleteMapping(value = "/company/{delete}")
    public void deleteCompany(@PathVariable("delete") Long companyId){
        companyService.deleteCompanyById(companyId);
    }

    @ApiOperation(value = "회사 찾기")
    @GetMapping(value = "/company/findById")
    public Company findCompany(Long companyId){
        return companyService.getCompanyById(companyId);
    }
}