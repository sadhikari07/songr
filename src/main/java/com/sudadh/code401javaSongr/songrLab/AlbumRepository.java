package com.sudadh.code401javaSongr.songrLab;

import org.springframework.data.repository.CrudRepository;




// sets up how Spring will interact with the database to retrieve/save/etc
public interface AlbumRepository extends CrudRepository<Album, Long> {

    }

