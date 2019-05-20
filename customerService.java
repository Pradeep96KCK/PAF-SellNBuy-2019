package org.o7planning.sbcrudrestful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class customerService {
	@Autowired
	private feedbackRepository repo;
	
	
	public List<feedBack> findAll(){
	return repo.findAll();
	}
/*	public void save(feedBack fdback) {
		repo.save(fdback);
		
	}
*/
	@org.springframework.transaction.annotation.Transactional(readOnly = false,isolation=Isolation.READ_COMMITTED)
	public feedBack save(feedBack feedback) {
		return repo.save(feedback);
		
	}
	
/*	public feedBack get(String cusID) {
		return repo.findById(cusID).get();
	}
	
	public void delete(String cusID) {
		repo.deleteById(cusID);
	}
*/

}
