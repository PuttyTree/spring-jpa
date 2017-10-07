package com.bkm.spring.jpa.dal;

import com.mysema.query.codegen.GenericExporter;
import com.mysema.query.codegen.Keywords;

import javax.persistence.*;
import java.io.File;

public class QueryDslGen {

	public static void main(String[] args) {
		GenericExporter exporter = new GenericExporter();
		exporter.setKeywords(Keywords.JPA);
		exporter.setEntityAnnotation(Entity.class);
		exporter.setEmbeddableAnnotation(Embeddable.class);
		exporter.setEmbeddedAnnotation(Embedded.class);
		exporter.setSupertypeAnnotation(MappedSuperclass.class);
		exporter.setSkipAnnotation(Transient.class);
		exporter.setTargetFolder(new File("E:/dsl"));
		exporter.export("com.bkm.spring.jpa.dal.entity");

		//exporter.export(com.bkm.spring.jpa.entity.Users.class.getPackage());


		/*exporter.setKeywords(Keywords.JPA);
		exporter.setEntityAnnotation(Entity.class);
		exporter.setEmbeddableAnnotation(Embeddable.class);
		exporter.setEmbeddedAnnotation(Embedded.class);
		exporter.setSupertypeAnnotation(MappedSuperclass.class);
		exporter.setSkipAnnotation(Transient.class);
		exporter.setTargetFolder(new File("target/generated-sources/java"));
		exporter.export(com.bkm.spring.jpa.entity.Users.class.getPackage());*/
	}
}
