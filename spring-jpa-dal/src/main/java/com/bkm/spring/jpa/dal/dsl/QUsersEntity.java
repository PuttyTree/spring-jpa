package com.bkm.spring.jpa.dal.dsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.bkm.spring.jpa.dal.entity.UsersEntity;
import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUsersEntity is a Querydsl query type for UsersEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUsersEntity extends EntityPathBase<UsersEntity> {

    private static final long serialVersionUID = 380303932L;

    public static final QUsersEntity usersEntity = new QUsersEntity("usersEntity");

    public final com.bkm.spring.jpa.dal.QBaseEntity _super = new com.bkm.spring.jpa.dal.QBaseEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> locked = createNumber("locked", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath password = createString("password");

    public final StringPath salt = createString("salt");

    public final StringPath userName = createString("userName");

    public QUsersEntity(String variable) {
        super(UsersEntity.class, forVariable(variable));
    }

    public QUsersEntity(Path<? extends UsersEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsersEntity(PathMetadata<?> metadata) {
        super(UsersEntity.class, metadata);
    }

}

