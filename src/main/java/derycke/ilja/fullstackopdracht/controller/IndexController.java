package derycke.ilja.fullstackopdracht.controller;

import derycke.ilja.fullstackopdracht.dao.OpleidingDAO;
import derycke.ilja.fullstackopdracht.model.Opleiding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class IndexController {
    @Autowired
    private OpleidingDAO repo;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    @ResponseBody
    public List<Opleiding> getAll(){
        return repo.findAll();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Opleiding> get(@RequestParam(value = "id") int id){
        return repo.findById(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    @ResponseBody
    public void addOpleiding(@RequestParam(value = "naam") String naam, @RequestParam(value = "omschrijving") String omschrijving, @RequestParam(value = "prijs") double prijs){
        Opleiding opleiding = new Opleiding(naam, omschrijving, prijs);
        repo.save(opleiding);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@RequestParam(value = "id") int id){
        repo.deleteById(id);
    }

}
