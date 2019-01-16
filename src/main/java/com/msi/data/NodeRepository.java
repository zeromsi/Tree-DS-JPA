package com.msi.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends JpaRepository <Node, Long>{

	List<Node> findAllChildrenByParentLabel(String label);

}
