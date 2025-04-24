package com.project.marmoraria.bosqueDosIpes.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.marmoraria.bosqueDosIpes.demo.Model.ClienteModel;
import com.project.marmoraria.bosqueDosIpes.demo.Service.ClienteService;



@Controller
@RestController("/cliente")
public class ClienteController {

	@Autowired		
	public ClienteService clienteService; //injeção de dependência
	
	
	@GetMapping //listar todos os clientes
	public List<ClienteModel> listarClientes() {
		return clienteService.listarClientes();
	}
	
	@GetMapping //buscar por id do cliente
	public ClienteModel buscarClientePorId(@PathVariable Long id) {
		return clienteService.buscarClientePorId(id);
	}
	
	@PostMapping
	public ClienteModel criarCliente(@RequestBody ClienteModel clienteModel) { //@RequestBody é o corpo vindo da requisição
		return clienteService.criarCliente(clienteModel);
	}
	@DeleteMapping
	public void deletarCLientePorId(@PathVariable Long id) { //se eu vou apagar um cliente, então não me retorna nada!
		clienteService.deletarCLientePorId(id);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<ClienteModel> atualizarCliente(@PathVariable Long id, @RequestBody ClienteModel clienteAtualizado) {
        return clienteService.atualizarCliente(id, clienteAtualizado);
    }
	
	
	
	

	
	
	
}
