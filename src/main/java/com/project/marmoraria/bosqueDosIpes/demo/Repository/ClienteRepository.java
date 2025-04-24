
package com.project.marmoraria.bosqueDosIpes.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.marmoraria.bosqueDosIpes.demo.Model.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

	//repostitory -> ele vai fazer a conexão direta com o vbanco de dados, então ele extende(extend) o Jpa
	
	//interface -> Ou seja, ela diz o que deve ser feito, mas não como.
	
	
	
	
}
