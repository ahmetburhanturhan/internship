package com.deneme.controller.controller;

import com.deneme.controller.model.Archieves;
import com.deneme.controller.model.Assignments;
import com.deneme.controller.service.ArchievesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/archieves")
public class ArchievesController {

    @Autowired
    ArchievesService archievesService;
    @GetMapping("/getAllArchieves")
    public List<Archieves> getAllArchieves(){
        return archievesService.getAllArchieves();
    }

    @PostMapping("add")
    public ResponseEntity<String> addArchieves(@RequestBody Archieves archieves){
        return  archievesService.addArchieves(archieves);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateArchieves(@RequestParam Integer archieveId, @RequestBody Archieves archieves){
        return archievesService.updateArchievesById(archieveId,archieves);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteArchievesById(@RequestParam Integer archieveId){
        return archievesService.deleteArchievesById(archieveId);
    }
}
