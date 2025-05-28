package com.example.GestionDeClientesV2.service;

import com.example.GestionDeClientesV2.model.Cliente;
import com.example.GestionDeClientesV2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    public void agregarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public String navegarProductos() {
        return "Navegando productos disponibles...";
    }

    public String agregarAlCarrito() {
        return "Producto agregado al carrito.";
    }

    public String realizarPedido() {
        return "Pedido realizado con éxito.";
    }

    public String solicitarSoporte() {
        return "Soporte solicitado. Un agente se pondrá en contacto.";
    }

    public String dejarReseña() {
        return "Gracias por dejar tu reseña.";
    }
}
