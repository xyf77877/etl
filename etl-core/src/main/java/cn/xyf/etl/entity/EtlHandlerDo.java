package cn.xyf.etl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etl_handle")
public class EtlHandlerDo {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "creat_time")
    private String creatTime;
    @Column(name = "script")
    private String script;
}
