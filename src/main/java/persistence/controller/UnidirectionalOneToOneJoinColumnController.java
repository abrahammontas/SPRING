package persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import persistence.daos.UnidirectionalOneToOneJoinColumnDao;
import persistence.entities.AnyEntity;
import persistence.entities.UnidirectionalOneToOneJoinColumnEntity;

@Controller
public class UnidirectionalOneToOneJoinColumnController {

    @Autowired
    private UnidirectionalOneToOneJoinColumnDao unidirectionalOneToOneJoinColumnDao;

    public void process() {
        AnyEntity anyEntity = new AnyEntity("daemon");
        UnidirectionalOneToOneJoinColumnEntity entity = new UnidirectionalOneToOneJoinColumnEntity("Mi Nick", anyEntity);
        unidirectionalOneToOneJoinColumnDao.save(entity);

        System.out.println(">>>> UnidirectionalOneToOneJoinColumnEntity:  " + unidirectionalOneToOneJoinColumnDao.findOne(entity.getId()));
    }
}
