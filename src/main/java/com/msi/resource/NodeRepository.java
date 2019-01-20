package com.msi.resource;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msi.data.Node;

@Repository
public interface NodeRepository extends JpaRepository <Node, Long>{

	List<Node> findAllChildrenByParentLabel(String label);
	Node findParentByChildrenLabel(String label);
	List<Node> findAllChildrenByParentChildrenLabel(String label);

}
