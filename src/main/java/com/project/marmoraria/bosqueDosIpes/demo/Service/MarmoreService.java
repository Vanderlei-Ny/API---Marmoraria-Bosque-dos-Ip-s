package com.project.marmoraria.bosqueDosIpes.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.marmoraria.bosqueDosIpes.demo.Model.MarmoreModel;
import com.project.marmoraria.bosqueDosIpes.demo.Repository.MarmoreRepository;

@Service
public class MarmoreService {

	public final MarmoreRepository marmoreRepo;

	@Autowired
	public MarmoreService(MarmoreRepository service) {
		this.marmoreRepo = service;
	}
	
	
	
	//para números menores do que 0
	public MarmoreModel criarMarmore(@RequestBody MarmoreModel marmoreModel) {
		
		if(marmoreModel.getComprimento() < 0 || marmoreModel.getLargura() < 0 || marmoreModel.getAltura() < 0 ) {
			throw new IllegalArgumentException("O comprimento não pode ser negativo!");
		}
		
		
		return marmoreRepo.save(marmoreModel);
	}
	
	public List<MarmoreModel> listarMarmores() {
		return marmoreRepo.findAll();
	}
	
	//listar por id
	public MarmoreModel marmorePorId(@PathVariable Long id ) {
		return marmoreRepo.findById(id).orElse(null);
	}
	
	//deletar marmore por id
	public void deletarMarmore(@PathVariable Long id) {
		marmoreRepo.deleteById(id);
	}
	//deletar todos os marmores
	public void deletarTodosMarmores() {
		marmoreRepo.deleteAll();
	}
	
	
	
	
	
}
