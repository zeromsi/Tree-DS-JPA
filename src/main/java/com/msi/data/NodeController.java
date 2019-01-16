package com.msi.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

	@Autowired
	NodeService nodeService;
	
	@GetMapping("/findAll")
	public List<VMNode> getAll(){
		return nodeService.getAll();
	}
	@GetMapping("/findAll/{label}")
	public List<VMNode> getAllByLabel(@PathVariable("label") String label ){
		return nodeService.getAllByParent(label);
	}
}
