package com.dasboot.controller;

import com.dasboot.model.Shipwreck;
import com.dasboot.model.ShipwreckStub;
import com.dasboot.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Octavian on 5/14/2017.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list(){
        return shipwreckRepository.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id){
        return shipwreckRepository.findOne(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
        Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck,existingShipwreck);
        return shipwreckRepository.saveAndFlush(existingShipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id){
        Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(existingShipwreck);
        return existingShipwreck;
    }


}
