package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.RolRepository;
import com.tempoquito.springboot.backend.apirest.models.entity.Rol;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private RolRepository rolDao;

    @Override
    @Transactional(readOnly = true)
    public List<Rol> findAll() {
        return rolDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Rol findById(Long id) {
        return rolDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Rol save(Rol rol) {
        return rolDao.save(rol);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        rolDao.deleteById(id);
    }
}
