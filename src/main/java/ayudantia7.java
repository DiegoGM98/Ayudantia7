import java.util.ArrayList;
import java.util.List;

class AgenciaDeViajes {
    private List<Cliente> clientes;
    private List<AgenteDeViajes> agentes;

    public AgenciaDeViajes() {
        clientes = new ArrayList<>();
        agentes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void agregarAgente(AgenteDeViajes agente) {
        agentes.add(agente);
    }

    public void eliminarAgente(AgenteDeViajes agente) {
        agentes.remove(agente);
    }

    public List<AgenteDeViajes> getAgentes() {
        return agentes;
    }
}



