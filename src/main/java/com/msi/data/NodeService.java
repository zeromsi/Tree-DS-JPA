package com.msi.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NodeService {

	@Autowired
	NodeRepository nodeRepository;
	
	public List<VMNode> getAll(){
		List<Node> nodes=nodeRepository.findAll();
		return Converter.convertDataToDomainList(nodes);
	}
	
	public List<VMNode> getAllByParent(String label){
		List<Node> nodes=nodeRepository.findAllChildrenByParentLabel(label);
		return Converter.convertDataToDomainList(nodes);
	}
}
