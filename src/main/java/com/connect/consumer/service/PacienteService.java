package com.connect.consumer.service;

import com.connect.consumer.model.Paciente;
import com.connect.consumer.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    public void salvarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }
}
