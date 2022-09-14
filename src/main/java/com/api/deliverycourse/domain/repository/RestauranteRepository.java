package com.api.deliverycourse.domain.repository;

import com.api.deliverycourse.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);
	
}
