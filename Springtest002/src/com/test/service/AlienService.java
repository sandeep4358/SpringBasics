package com.test.service;

import java.util.List;

public interface AlienService {
	public Alien getById(int id);

	public List<Alien> getAll();

	public List<Alien> addAlien(Alien alien);
}
