package mserv.cliente.cl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mserv.cliente.cl.model.Cliente;
import mserv.cliente.cl.repository.ClienteRepository;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	@PostMapping("/save")
	public Cliente create(@Validated @RequestBody Cliente cl) {
		return clienteRepository.insert(cl);	}
	@GetMapping("/")
	public List<Cliente> readAll() {
		return clienteRepository.findAll();
	}
	@PutMapping("/update/{id}")
	
	public Cliente update(@PathVariable String id, @Validated @RequestBody Cliente cl) {
		return clienteRepository.save(cl);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		clienteRepository.deleteById(id);
	}
}
