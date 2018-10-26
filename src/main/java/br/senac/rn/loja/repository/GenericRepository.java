package br.senac.rn.loja.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import br.senac.rn.loja.model.AuditedEntity;

@NoRepositoryBean
public interface GenericRepository<T extends AuditedEntity> extends JpaRepository<T, Integer> {

//	@Override
//	@Query(value="SELECT e FROM #{#entityName} e WHERE e.ativo=true")
//	List<T> findAll();
//
//	@Override
//	@Query(value="SELECT e from #{#entityName} e WHERE e.ativo=true AND e.id =:id")
//	Optional<T> findById(@Param(value="id") Integer id);
//
//	@Override
//	@Transactional
//	@Modifying
//	@Query(value="UPDATE #{#entityName} e SET e.ativo=false WHERE e.id=:id")
//	void deleteById(@Param(value="id") Integer id);
//
//	@Override
//	@Transactional
//	@Modifying
//	@Query(value="UPDATE #{#entityName} e SET e.ativo=false WHERE e=:entity")
//	void delete(@Param(value="entity") T entity);

}
