package com.msi.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.msi.business.domain.VMNode;
import com.msi.business.service.NodeService;
import com.msi.data.Node;

@RestController
public class NodeController {

	@Autowired
	NodeService nodeService;
	
	@GetMapping("/findAll")
	public List<VMNode> getAll(){
		return nodeService.getAll();
	}
	@GetMapping("/findAllChilds/{label}")
	public List<VMNode> getAllByLabel(@PathVariable("label") String label ){
		return nodeService.getAllByParent(label);
	}
	
	@GetMapping("/findParent/{label}")
	public VMNode findParent(@PathVariable("label") String label ){
		return nodeService.getParent(label);
	}
	
	@GetMapping("/getAllSiblings/{label}")
	public List<VMNode> findSiblings(@PathVariable("label") String label ){
		return nodeService.getAllSiblings(label);
	}
	
	@PostMapping
	public boolean save(@RequestBody Node node) {
		return nodeService.save(node);	
	}
}
