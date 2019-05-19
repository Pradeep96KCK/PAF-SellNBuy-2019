package com.paf;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class itemService {
	
	@Autowired
	private itemRepository itmrepo;
	
	
	//save an item
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)	
	public Item save(Item itm) {
		return itmrepo.save(itm);
	}
	
	//get all
	public List<Item> findAll(){
		return itmrepo.findAll();
	}
	
	//get item
	public Item findOne(Integer itm) {
		Optional<Item> op = itmrepo.findById(itm);
		if(op.isPresent()) {
		return op.get();
		}
		else {
		return null;
		}
		}
	
	//delete an item by id
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	public void delete(Item itm) {
	itmrepo.delete(itm);
	}
}
