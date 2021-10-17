package mserv.cliente.cl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mserv.cliente.cl.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {


}
