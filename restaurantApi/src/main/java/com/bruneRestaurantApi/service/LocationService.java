package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.Location;
import com.bruneRestaurantApi.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository repository;

    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    public List<Location> saveLocations(List<Location> locations) { return repository.saveAll(locations); }

    public List<Location> getLocations() { return repository.findAll(); }

    public Location getLocationById(int id) { return repository.findById(id).orElse(null); }

    public String deleteLocation(int id) {
        repository.deleteById(id);
        return "Location removeed " + id;
        }

    public Location updateLocation(Location location) {
        Location existingLocation=repository.findById(location.getId()).orElse(null);
        assert existingLocation != null;
        existingLocation.setLocationName(location.getLocationName());;
        existingLocation.setStreet1(location.getStreet1());
        existingLocation.setStreet2(location.getStreet2());
        existingLocation.setCity(location.getCity());
        existingLocation.setState(location.getState());
        existingLocation.setZip(location.getZip());
        existingLocation.setPhone(location.getPhone());
        existingLocation.setTextPhone(location.getTextPhone());
        existingLocation.setEmail(location.getEmail());
        return repository.save(existingLocation);
    }
}
