package cn.xyf.etl.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class EtlHandlerDto {
    private String id;
    private String name;
    private String code;
    private String creatTime;
    private String script;
}
