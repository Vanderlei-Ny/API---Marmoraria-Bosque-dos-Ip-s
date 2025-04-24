package com.project.marmoraria.bosqueDosIpes.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.marmoraria.bosqueDosIpes.demo.Model.ClienteModel;
import com.project.marmoraria.bosqueDosIpes.demo.Repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	//listar todos clientes
	public List<ClienteModel> listarClientes() {
		return clienteRepository.findAll();
	}
	
	public ClienteModel buscarClientePorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	//criar clienTE
	public ClienteModel criarCliente( ClienteModel cliente) {
		return clienteRepository.save(cliente);
	}
	
	//deletar cliente por id
	public void deletarCLientePorId(Long id) {
		clienteRepository.deleteById(id);
	}
	
	//atualizar dados
	
	
	
	public ResponseEntity<ClienteModel> atualizarCliente(Long id, ClienteModel clienteAtualizado) {
		ClienteModel clienteExistente = buscarClientePorId(id);

		if (clienteExistente == null) {
			return ResponseEntity.notFound().build(); //retorna 404 -> notFound -> não encontrado
		
		}
		clienteExistente.setNome(clienteAtualizado.getNome());
		clienteExistente.setTelefone(clienteAtualizado.getTelefone());

		ClienteModel clienteSalvo = clienteRepository.save(clienteExistente);
		return ResponseEntity.ok(clienteSalvo); //retorna HTTP 200 + Json do cliente
		
	}
	
	
	
	
}
