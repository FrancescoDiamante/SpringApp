package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.domain.ClienteSpring;
import mvc.repository.ClienteRepository;

@Service
	public class ClienteServiceWithCrudRepository 
	{
		private ClienteRepository clienteRepository;
		
		@Autowired
		public ClienteServiceWithCrudRepository(ClienteRepository clienteRepository)
		{
			this.clienteRepository=clienteRepository;
		}
	
		public ClienteSpring create(ClienteSpring cliente)
		{
			System.out.println(cliente);
			return  clienteRepository.save(cliente);
		}
		
		public ClienteSpring update(ClienteSpring cliente)
		{ 
			ClienteSpring c1=clienteRepository.findOne(cliente.getCf());
			cliente.setNumeroPrenotazioni(c1.getNumeroPrenotazioni());
			cliente.setPassword(c1.getPassword());
			clienteRepository.delete(cliente.getCf());
			return clienteRepository.save(cliente);
		}
	
		public ClienteSpring getClienteByCF(String CF)
		{
			return  clienteRepository.findOne(CF);
		}
	}
