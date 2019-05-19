package com.paf;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class itemController {
	@Autowired
	private itemService service;
	
	//save an item
	@PostMapping("item")
	public Item createItem(@Valid @RequestBody Item itm) {
		return service.save(itm);		
	}
	
	//get all
	@GetMapping("item")
	public List<Item> findAll()
	{
		return service.findAll();
	}
	
	//get item by id
	@GetMapping("item/{id}")
	public ResponseEntity<Item> getItemByID(@PathVariable(value="id") Integer itmID)
	{
		Item itm = service.findOne(itmID);
		if(itmID==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(itm);
		
	}
	
	//Update an Item by id
	@PutMapping("item/{id}")
	
		public ResponseEntity<Item> updateItem(@PathVariable(value = "id")Integer itmID,
				@Valid @RequestBody Item itd)
		{
		{
			Item itm = service.findOne(itmID);
			
			if(itm==null) {
				return ResponseEntity.notFound().build();
			}
			itm.setItemName(itd.getItemName());
			itm.setDescription(itd.getDescription());
			itm.setPrice(itd.getPrice());
			
			Item updateItem = service.save(itm);
			
			return ResponseEntity.ok().body(updateItem);
		}
	}
	
	//delete an item
	@DeleteMapping("item/{id}")
	public ResponseEntity<Item> deleteItem(@PathVariable(value="id") Integer itmID)
	{
		Item itm = service.findOne(itmID);
		if(itm==null)
		{
			return ResponseEntity.notFound().build();
		}
		service.delete(itm);
		return ResponseEntity.ok().build();
	}

	
	
	

}
