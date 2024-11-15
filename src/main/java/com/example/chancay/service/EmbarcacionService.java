package com.example.chancay.service;

import com.example.chancay.model.Embarcacion;
import com.example.chancay.repository.EmbarcacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmbarcacionService {
    
    @Autowired
    private EmbarcacionRepository embarcacionRepository;

    //Método para listar las embarcaciones
    public List<Embarcacion> getAllEmbarcaciones(){
        return embarcacionRepository.findAll();
    }

    //Método para obtener una embarcacion por su Id
    public Embarcacion getEmbarcacionbyId(Integer Id){
        return embarcacionRepository.findById(Id).orElse(null);
    }

    //Método para crear una embarcacion
    public Embarcacion createEmbarcacion(Embarcacion embarcacion){
        return embarcacionRepository.save(embarcacion);
    }

    //Método para actualizar o editar una embarcacion segun su Id
    public Embarcacion updateEmbarcacion(Embarcacion embarcacion, Integer Id){
        Embarcacion embarcacionActual = embarcacionRepository.findById(Id).orElse(null);
        if (embarcacion != null){
            embarcacionActual.setNombre(embarcacion.getNombre());
            embarcacionActual.setCapacidad(embarcacion.getCapacidad());
            embarcacionActual.setDescripcion(embarcacion.getDescripcion());
            return embarcacionRepository.save(embarcacionActual);
        }
        return null;
    }

    //Método para eliminar una embarcacion segun su Id
    public void deleteEmbarcacion(Integer Id){
        embarcacionRepository.deleteById(Id);
    }
}
