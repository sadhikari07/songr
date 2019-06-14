package com.sudadh.code401javaSongr.songrLab;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


// sets up how Spring will interact with the database to retrieve/save/etc
public interface AlbumRepository extends CrudRepository<Album, Long> {

    public List<Album> findByName(String name);

}

