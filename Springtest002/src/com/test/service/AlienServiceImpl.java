package com.test.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("AlienService")
public class AlienServiceImpl implements AlienService {

	/**
	 * List of all the alien...
	 */
	private List<Alien> listOfData = null;

	public AlienServiceImpl() {
		listOfData = new ArrayList<Alien>();
		Alien a1 = new Alien(11, "Andy", 60);
		Alien a2 = new Alien(12, "Mark", 70);
		Alien a3 = new Alien(13, "Rudy", 77);
		Alien a4 = new Alien(14, "Rody", 89);
		listOfData.add(a1);
		listOfData.add(a2);
		listOfData.add(a3);
		listOfData.add(a4);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Alien getById(int id) {
		Alien next = null;
		Iterator<Alien> iterator = listOfData.iterator();
		while (iterator.hasNext()) {
			next = iterator.next();
			if (next.getAid() == id) {
				break;
			}
		}
		return next;

	}

	/**
	 * 
	 * @return
	 */
	public List<Alien> getAll() {
		return listOfData;
	}

	/**
	 * 
	 * @param alien
	 * @return
	 */
	public List<Alien> addAlien(Alien alien) {
		listOfData.remove(alien);
		return listOfData;
	}

}
