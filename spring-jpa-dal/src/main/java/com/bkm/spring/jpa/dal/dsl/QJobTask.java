package com.bkm.spring.jpa.dal.dsl;

import com.bkm.spring.jpa.dal.entity.JobTask;
import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;

import javax.annotation.Generated;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QJobTask is a Querydsl query type for JobTask
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QJobTask extends EntityPathBase<JobTask> {

    private static final long serialVersionUID = 1290097620L;

    public static final QJobTask jobTask = new QJobTask("jobTask");

    public final NumberPath<Integer> execCount = createNumber("execCount", Integer.class);

    public final DateTimePath<java.util.Date> execLastTime = createDateTime("execLastTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> execNextTime = createDateTime("execNextTime", java.util.Date.class);

    public final StringPath failReason = createString("failReason");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jobError = createString("jobError");

    public final StringPath linshi = createString("linshi");

    public final NumberPath<Integer> maxCount = createNumber("maxCount", Integer.class);

    public final NumberPath<Integer> nextTimesSecond = createNumber("nextTimesSecond", Integer.class);

    public final StringPath param1 = createString("param1");

    public final StringPath param2 = createString("param2");

    public final StringPath param3 = createString("param3");

    public final NumberPath<Integer> paramSize = createNumber("paramSize", Integer.class);

    public final NumberPath<Long> serialversionuid = createNumber("serialversionuid", Long.class);

    public final StringPath status = createString("status");

    public final StringPath taskCls = createString("taskCls");

    public final DateTimePath<java.util.Date> timeInst = createDateTime("timeInst", java.util.Date.class);

    public final DateTimePath<java.util.Date> timeUpd = createDateTime("timeUpd", java.util.Date.class);

    public final StringPath type = createString("type");

    public final StringPath uniqueId = createString("uniqueId");

    public QJobTask(String variable) {
        super(JobTask.class, forVariable(variable));
    }

    public QJobTask(Path<? extends JobTask> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJobTask(PathMetadata<?> metadata) {
        super(JobTask.class, metadata);
    }

}

