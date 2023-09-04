package com.deneme.controller.service;

import com.deneme.controller.model.Archieves;
import com.deneme.controller.repository.ArchievesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchievesService {

    @Autowired
    ArchievesDao archievesDao;

    public List<Archieves> getAllArchieves(){
        return archievesDao.findAll();
    }

    public ResponseEntity<String> addArchieves(Archieves archieves) {
        archievesDao.save(archieves);
        return new ResponseEntity<>("new archieves added", HttpStatus.CREATED);
    }


    public ResponseEntity<String> updateArchievesById(Integer archieveId, Archieves archieves) {
        Archieves wta = archievesDao.findById(archieveId).get();

        if(archieves.getDates() != null){
            wta.setDates(archieves.getDates());
        }
        if(archieves.getArchieveId() != null){
            wta.setArchieveId(archieves.getArchieveId());
        }
        if(archieves.getHours() != 0){
            wta.setHours(archieves.getHours());
        }

        archievesDao.save(wta);

        return new ResponseEntity<>("archieves updated", HttpStatus.OK);
    }

    public ResponseEntity<String> deleteArchievesById(Integer archieveId) {
        archievesDao.deleteById(archieveId);
        return new ResponseEntity<>("archieves deleted", HttpStatus.NO_CONTENT) ;
    }
}
