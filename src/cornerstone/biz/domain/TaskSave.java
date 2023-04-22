package cornerstone.biz.domain;

import java.util.Date;

import cornerstone.biz.annotations.DomainDefineValid;
import cornerstone.biz.annotations.DomainFieldValid;
import cornerstone.biz.domain.query.BizQuery;
import jazmin.driver.jdbc.smartjdbc.annotations.DomainDefine;
import jazmin.driver.jdbc.smartjdbc.annotations.ForeignKey;
import jazmin.driver.jdbc.smartjdbc.annotations.QueryDefine;
import jazmin.driver.jdbc.smartjdbc.annotations.QueryField;

@DomainDefine(domainClass = TaskSave.class)
@DomainDefineValid(comment ="任务提醒时间" )
public class TaskSave extends BaseDomain{
    @DomainFieldValid(comment="任务ID",required=true,canUpdate=true)
    public int taskId;

    @DomainFieldValid(comment="保存名称",required=true,canUpdate=true)
    public String saveName;

    @DomainFieldValid(comment="保存内容",required=true,canUpdate=true)
    public String saveData;

    @DomainFieldValid(comment="用户id",required=true,canUpdate=true)
    public int accountId;
}