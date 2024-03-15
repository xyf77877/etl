package cn.xyf.etl.repository;

import cn.xyf.etl.entity.EtlHandlerDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtlHandlerRepository extends JpaRepository<EtlHandlerDo, String> {

}
