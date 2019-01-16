package com.msi.data;

import java.util.ArrayList;
import java.util.List;

public class Converter {

	public static VMNode convertDataToDomain(Node node){
		return new VMNode(node.getLabel());
	}
	
	public static List<VMNode> convertDataToDomainList(List<Node> nodes){
		List<VMNode> vmNodes=new ArrayList<>();
		for(int i=0;i<nodes.size();i++) {
			vmNodes.add(new VMNode(nodes.get(i).getLabel()));
		}
		return vmNodes;
	}
}
