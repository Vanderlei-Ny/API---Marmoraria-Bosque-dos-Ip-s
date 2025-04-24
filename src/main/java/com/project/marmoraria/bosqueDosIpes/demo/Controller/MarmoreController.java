package com.project.marmoraria.bosqueDosIpes.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.marmoraria.bosqueDosIpes.demo.Model.MarmoreModel;
import com.project.marmoraria.bosqueDosIpes.demo.Service.MarmoreService;

@Controller
@RestController("/marmore")
public class MarmoreController {

	@Autowired
	public MarmoreService service;

	// listar todos os mármores
	@GetMapping("/listarMarmores")
	public List<MarmoreModel> listarMarmores() {
		 ResponseEntity.ok("Resposta com status 200 ok");
	
		return service.listarMarmores();
	}

	// listar marmore por id
	@GetMapping
	public MarmoreModel marmorePorId(@PathVariable Long id) {
		return service.marmorePorId(id);
	}
	
	@PostMapping
	public MarmoreModel criarMarmore(@RequestBody MarmoreModel marmoreModel) {
		return service.criarMarmore(marmoreModel);
	}

	// deletar marmore
	@DeleteMapping
	public void deletarMarmore(@PathVariable Long id) {
		service.deletarMarmore(id);
	}
	
	
	@DeleteMapping
	public void deletarTodosMarmores() {
		service.deletarTodosMarmores();
	}
	
	
}
