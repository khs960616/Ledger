package ledger;
import java.util.List;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.RequiredArgsConstructor;

@Api(tags= {"2. 납품 물건 목록"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value ="/v2")
public class ItemController {
	private ItemService itemService;
	
	@ApiOperation(value = "납품 물건 추가", notes = "물건을 추가한다.")
	@PutMapping(value = "/item")
	public Item saveItem(@ModelAttribute Item itemParam) {
		return itemService.createItem(itemParam);
    }
    
    @ApiOperation(value = "품목 id", notes = "품목 검색")
    @GetMapping(value = "i/tem/{getById}")
    public Item getItem(@PathVariable("getById") Long itemId){
        return itemService.getItemById(itemId);
    }

    @ApiOperation(value ="모든품목 검색")
    @GetMapping(value = "/item/findall")
    public List<Item> getAllItem(){
        return itemService.getAllItem();
    }

    @ApiOperation(value = " 품목 삭제")
    @DeleteMapping(value = "/item/{delete}" )
    public void deleteItem(@PathVariable("delete") Long itemId){
	     itemService.deleteItemById(itemId);
    }
    
    
}