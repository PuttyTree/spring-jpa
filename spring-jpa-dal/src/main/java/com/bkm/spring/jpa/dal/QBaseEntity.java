package com.bkm.spring.jpa.dal;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.BooleanPath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.SimplePath;

import javax.annotation.Generated;
import java.io.Serializable;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QBaseEntity is a Querydsl query type for BaseEntity
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QBaseEntity extends EntityPathBase<BaseEntity<? extends Serializable>> {

	private static final long serialVersionUID = -297663518L;

	public static final QBaseEntity baseEntity = new QBaseEntity("baseEntity");

	public final SimplePath<Serializable> id = createSimple("id", Serializable.class);

	public final BooleanPath new$ = createBoolean("new");


	@SuppressWarnings("all")
	public QBaseEntity(String variable) {
		super((Class) BaseEntity.class, forVariable(variable));
	}

	@SuppressWarnings("all")
	public QBaseEntity(Path<? extends BaseEntity> path) {
		super((Class) path.getType(), path.getMetadata());
	}

	@SuppressWarnings("all")
	public QBaseEntity(PathMetadata<?> metadata) {
		super((Class) BaseEntity.class, metadata);
	}

}

