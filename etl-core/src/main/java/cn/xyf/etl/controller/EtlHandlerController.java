package cn.xyf.etl.controller;

import cn.xyf.etl.common.response.ResponseBody;
import cn.xyf.etl.service.EtlHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("etl")
public class EtlHandlerController {
    @Autowired
    private EtlHandlerService etlHandlerService;

    @GetMapping("")
    public ResponseBody queryList(){
        return null;
    }
}
