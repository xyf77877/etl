package cn.xyf.etl.service.impl;

import cn.xyf.etl.dto.EtlHandlerDto;
import cn.xyf.etl.entity.EtlHandlerDo;
import cn.xyf.etl.repository.EtlHandlerRepository;
import cn.xyf.etl.service.EtlHandlerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class EtlHandlerServiceImpl implements EtlHandlerService {

    @Autowired
    private EtlHandlerRepository etlHandlerRepository;

    @Override
    public void save(EtlHandlerDto dto) {
        EtlHandlerDo etlHandlerDo = new EtlHandlerDo();
        dto.setId(UUID.randomUUID().toString());
        dto.setCreatTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        BeanUtils.copyProperties(dto, etlHandlerDo);
        etlHandlerRepository.save(etlHandlerDo);
        AtomicInteger integer = new AtomicInteger();
        AtomicReference<String> atomicReference = new AtomicReference<>();
    }
}
