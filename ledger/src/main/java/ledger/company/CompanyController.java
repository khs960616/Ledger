package ledger.company;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.RequiredArgsConstructor;

@Api(tags= {"1. 사업체 관리"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value ="/v1")
public class CompanyController {
	
	private final CompanyService companyService;
	
	@ApiOperation(value = "사업체 추가", notes = "사업체 정보(기공소/치과/보건소) 를 추가합니다.")
	@PostMapping(value = "/company")
	public Company saveCompany(@ModelAttribute Company param) {
		return companyService.addCompanyInfo(param);
	}
}