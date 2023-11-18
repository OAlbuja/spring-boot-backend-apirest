// Implementación del servicio para Match

package com.tempoquito.springboot.backend.apirest.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tempoquito.springboot.backend.apirest.models.dao.IMatchDao;
import com.tempoquito.springboot.backend.apirest.models.entity.Match;

@Service
public class MatchServiceImpl implements IMatchService {

    @Autowired
    private IMatchDao matchDao;

    @Override
    @Transactional(readOnly = true)
    public List<Match> findAll() {
        return (List<Match>) matchDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Match findById(Long id) {
        return matchDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Match save(Match match) {
        return matchDao.save(match);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        matchDao.deleteById(id);
    }
}
