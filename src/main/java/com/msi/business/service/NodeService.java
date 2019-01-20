package com.msi.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msi.business.domain.VMNode;
import com.msi.converter.Converter;
import com.msi.data.Node;
import com.msi.resource.NodeRepository;

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
	
	public List<VMNode> getAllSiblings(String label){
		List<Node> nodes=nodeRepository.findAllChildrenByParentChildrenLabel(label);
		return Converter.convertDataToDomainList(nodes);
	}

	public boolean save(Node node) {
		try {
		nodeRepository.save(node);
		return true;
		}catch(Exception e) {
			
		}
		return false;
	}

	public VMNode getParent(String label) {
		Node node=nodeRepository.findParentByChildrenLabel(label);
		return Converter.convertDataToDomain(node);
	}
}
