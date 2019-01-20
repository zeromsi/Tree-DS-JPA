package com.msi.converter;

import java.util.ArrayList;
import java.util.List;

import com.msi.business.domain.VMNode;
import com.msi.data.Node;

public class Converter {

	public static VMNode convertDataToDomain(Node node){
		VMNode vmNode=new VMNode();
		vmNode.setLabel(node.getLabel());
		vmNode.setUrl(node.getUrl());
		List<VMNode> vMNodes=new ArrayList<>();
		for(int i=0;i<node.getChildren().size();i++) {
			vMNodes.add(convertDataToDomain(node.getChildren().get(i)));
		}
		vmNode.setChildren(vMNodes);
		return vmNode;
	}
	
	public static List<VMNode> convertDataToDomainList(List<Node> nodes){
		List<VMNode> vmNodes=new ArrayList<>();
		for(int i=0;i<nodes.size();i++) {
			vmNodes.add(convertDataToDomain(nodes.get(i)));
		}
		return vmNodes;
	}
}
