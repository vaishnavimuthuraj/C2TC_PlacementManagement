package com.tnsif.pm.placementservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController
{
@Autowired
private PlacementService  service;

@GetMapping("/placement")
public List<Placement>list()
{
return service.listAll();
}
//Retrieve by ID
@GetMapping("/placement/{id}")
public ResponseEntity<Placement>get(@PathVariable Long id)
{
  try
{
Placement placement=service.get(id);
return new ResponseEntity<Placement>(placement,HttpStatus.OK);
}
catch(Exception e)
{
return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
}
}
//Create Operation
@PostMapping("/placement")
public void add(@RequestBody Placement placement)
{
service.save(placement);
}
//Update Operation
@PutMapping("/placement/{id}")
public ResponseEntity<?> update(@RequestBody Placement placement,@PathVariable Long id)
{

try
{
Placement existplacement=service.get(id);
placement.setId(id);
service.save(placement);
return new ResponseEntity<Placement>(placement,HttpStatus.OK);
}
catch(Exception e)
{
return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
}
}
//Delete Operation
@DeleteMapping("/placement/{id}")
public void delete(@PathVariable Long id)
{
service.delete(id);
}
}
