package com.bkm.spring.jpa.dal.dsl;

import com.bkm.spring.jpa.dal.entity.Users;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.BooleanPath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;

import javax.annotation.Generated;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QUsers is a Querydsl query type for Users
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUsers extends EntityPathBase<Users> {

    private static final long serialVersionUID = 1473075066L;

    public static final QUsers users = new QUsers("users");

    public final com.bkm.spring.jpa.dal.QBaseEntity _super = new com.bkm.spring.jpa.dal.QBaseEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> locked = createNumber("locked", Integer.class);

    //inherited
    public final BooleanPath new$ = _super.new$;

    public final StringPath password = createString("password");

    public final StringPath salt = createString("salt");

    public final StringPath userName = createString("userName");

    public QUsers(String variable) {
        super(Users.class, forVariable(variable));
    }

    public QUsers(Path<? extends Users> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsers(PathMetadata<?> metadata) {
        super(Users.class, metadata);
    }

}

