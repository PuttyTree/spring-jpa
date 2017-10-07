package com.bkm.spring.jpa.dal.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "job_task")
@NamedQuery(name = "JobTask.findAll", query = "SELECT a FROM JobTask a")
public class JobTask implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * 唯一码
	 */
	@Column(name = "unique_id")
	private String uniqueId;
	/**
	 * 任务类型
	 */
	@Column(name = "`type`")
	private String type;
	/**
	 * 执行时间间隔
	 */
	@Column(name = "next_times_second")
	private Integer nextTimesSecond;
	/**
	 * 最后一次执行时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "exec_last_time")
	private Date execLastTime;
	/**
	 * 下次执行时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "exec_next_time", nullable = true)
	private Date execNextTime;
	/**
	 * task实现类
	 */
	@Column(name = "task_cls")
	private String taskCls;
	/**
	 * 参数个数
	 */
	@Column(name = "param_size")
	private Integer paramSize;
	/**
	 * 参数1
	 */
	@Column(name = "param1")
	private String param1;
	/**
	 * 参数2
	 */
	@Column(name = "param2")
	private String param2;
	/**
	 * 参数3
	 */
	@Column(name = "param3")
	private String param3;
	/**
	 * 状态:SUCCESS，成功 FAIL,失败,STOP 停止 STARTTING 执行中
	 */
	@Column(name = "`status`")
	private String status;
	/**
	 * 任务调度中出现的异常
	 */
	@Column(name = "job_error")
	private String jobError;
	/**
	 * 最大执行次数
	 */
	@Column(name = "max_count")
	private Integer maxCount;
	/**
	 * 当前已执行次数
	 */
	@Column(name = "exec_count")
	private int execCount;
	/**
	 * 业务执行错误
	 */
	@Column(name = "fail_reason")
	private String failReason;
	/**
	 * 插入时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_inst")
	private Date timeInst;
	/**
	 * 更新时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_upd")
	private Date timeUpd;
	@Column(name = "linshi")
	private String linshi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNextTimesSecond() {
		return nextTimesSecond;
	}

	public void setNextTimesSecond(Integer nextTimesSecond) {
		this.nextTimesSecond = nextTimesSecond;
	}

	public Date getExecLastTime() {
		return execLastTime;
	}

	public void setExecLastTime(Date execLastTime) {
		this.execLastTime = execLastTime;
	}

	public Date getExecNextTime() {
		return execNextTime;
	}

	public void setExecNextTime(Date execNextTime) {
		this.execNextTime = execNextTime;
	}

	public String getTaskCls() {
		return taskCls;
	}

	public void setTaskCls(String taskCls) {
		this.taskCls = taskCls;
	}

	public Integer getParamSize() {
		return paramSize;
	}

	public void setParamSize(Integer paramSize) {
		this.paramSize = paramSize;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	public int getExecCount() {
		return execCount;
	}

	public void setExecCount(int execCount) {
		this.execCount = execCount;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Date getTimeInst() {
		return timeInst;
	}

	public void setTimeInst(Date timeInst) {
		this.timeInst = timeInst;
	}

	public Date getTimeUpd() {
		return timeUpd;
	}

	public void setTimeUpd(Date timeUpd) {
		this.timeUpd = timeUpd;
	}

	public String getJobError() {
		return jobError;
	}

	public void setJobError(String jobError) {
		this.jobError = jobError;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getLinshi() {
		return linshi;
	}

	public void setLinshi(String linshi) {
		this.linshi = linshi;
	}
}
