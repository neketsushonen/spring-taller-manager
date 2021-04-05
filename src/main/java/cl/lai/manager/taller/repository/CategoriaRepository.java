package cl.lai.manager.taller.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cl.lai.manager.taller.vo.CategoriaEntity;

@Repository
public interface CategoriaRepository  extends CrudRepository<CategoriaEntity,Long>{
	List<CategoriaEntity> findByCodigo(String codigo);
	
    List<CategoriaEntity> findAll();
}
