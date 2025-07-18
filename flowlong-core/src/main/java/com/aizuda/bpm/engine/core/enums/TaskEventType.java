/*
 * Copyright 2023-2025 Licensed under the Dual Licensing
 * website: https://aizuda.com
 */
package com.aizuda.bpm.engine.core.enums;

/**
 * 流程任务事件监听类型
 *
 * <p>
 * <a href="https://aizuda.com">官网</a>尊重知识产权，不允许非法使用，后果自负
 * </p>
 *
 * @author lizhongyuan
 * @since 1.0
 */
public enum TaskEventType {
    /**
     * 发起
     */
    start,
    /**
     * 发起暂存草稿
     */
    startAsDraft,
    /**
     * 重新发起
     */
    restart,
    /**
     * 创建
     */
    create,
    /**
     * 再创建，仅用于流程回退
     */
    recreate,
    /**
     * 抄送
     */
    cc,
    /**
     * 手动创建抄送任务
     */
    createCc,
    /**
     * 分配
     */
    assignment,
    /**
     * 委派任务解决
     */
    delegateResolve,
    /**
     * 会签加签
     */
    addCountersign,
    /**
     * 任务加签
     */
    addTaskActor,
    /**
     * 任务减签
     */
    removeTaskActor,
    /**
     * 驳回至上一步处理
     */
    reject,
    /**
     * 角色认领
     */
    claimRole,
    /**
     * 部门认领
     */
    claimDepartment,
    /**
     * 拿回未执行任务
     */
    reclaim,
    /**
     * 撤回指定任务
     */
    withdraw,
    /**
     * 唤醒历史任务
     */
    resume,
    /**
     * 完成
     */
    complete,
    /**
     * 撤销
     */
    revoke,
    /**
     * 终止
     */
    terminate,
    /**
     * 更新
     */
    update,
    /**
     * 删除
     */
    delete,
    /**
     * 调用外部流程任务【办理子流程】
     */
    callProcess,
    /**
     * 超时
     */
    timeout,
    /**
     * 跳转
     */
    jump,
    /**
     * 自动跳转
     */
    autoJump,
    /**
     * 驳回跳转
     */
    rejectJump,
    /**
     * 路由跳转
     */
    routeJump,
    /**
     * 重新审批跳转
     */
    reApproveJump,
    /**
     * 重新审批创建
     */
    reApproveCreate,
    /**
     * 自动审批完成
     */
    autoComplete,
    /**
     * 自动审批拒绝
     */
    autoReject,
    /**
     * 触发器任务
     */
    trigger,
    /**
     * 结束
     */
    end;

    public boolean eq(TaskEventType eventType) {
        return this == eventType;
    }

    public boolean ne(TaskEventType eventType) {
        return this != eventType;
    }
}
