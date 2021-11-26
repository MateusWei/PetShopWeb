package com.petshopweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshopweb.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, String>{

	void delete(Pedido p);

	Pedido findByCodigo(long codigo);

}
