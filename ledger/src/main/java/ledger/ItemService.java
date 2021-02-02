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
public class ItemService {
	private  ItemJpaRepo itemJpaRepo;
	
	public List<Item> getAllItem(){
		return itemJpaRepo.findAll();
    }
 
	public Item getItemById(Long itemId){
        return itemJpaRepo.findById(itemId).get();
    }

	public Item createItem(Item itemParam) {
		Item item = Item.builder()
                .itemId(itemParam.getItemId())
                .itemName(itemParam.getItemName())
				.build();
		return itemJpaRepo.save(item);
	}
	
	public void deleteItemById(Long itemId) {
		Item item = itemJpaRepo.findById(itemId).get();
		if(item==null) {
			log.info("Not Exist Error :: Item");
		}
		itemJpaRepo.delete(item);
	}
}
