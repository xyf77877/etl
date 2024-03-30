package cn.xyf.etl.controller;

import cn.xyf.etl.common.response.ResponseBody;
import cn.xyf.etl.dto.EtlHandlerDto;
import cn.xyf.etl.service.EtlHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crud")
public class EtlHandlerController {
    @Autowired
    private EtlHandlerService etlHandlerService;

    @PostMapping("save")
    public ResponseBody queryList(EtlHandlerDto dto){
        etlHandlerService.save(dto);
        return ResponseBody.success();
    }

    public static void main(String[] args) {
        EtlHandlerDto etlHandlerDto = new EtlHandlerDto();
        etlHandlerDto.setCode("111");
        EtlHandlerDto etlHandlerDto2 = new EtlHandlerDto();
        etlHandlerDto2=etlHandlerDto;
        System.out.println(etlHandlerDto==etlHandlerDto2);

    }
}
