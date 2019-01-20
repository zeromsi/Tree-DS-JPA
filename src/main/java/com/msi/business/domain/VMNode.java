package com.msi.business.domain;

import java.util.List;


public class VMNode {
	public VMNode() {
		super();
	}

	private String label;
	private String url;
	private List<VMNode> children;
	

	public VMNode(String label, String url, List<VMNode> children) {
		super();
		this.label = label;
		this.url = url;
		this.children = children;
	}

	

	public List<VMNode> getChildren() {
		return children;
	}

	public void setChildren(List<VMNode> children) {
		this.children = children;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
