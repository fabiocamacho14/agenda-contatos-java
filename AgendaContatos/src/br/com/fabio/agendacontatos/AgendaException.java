package br.com.fabio.agendacontatos;

/**
 * Representa uma exceção genérica da aplicação de agenda
 */
@SuppressWarnings("serial")
public class AgendaException extends Exception {

	/**
	 * @see Exception#Exception(String)
	 * @param message Mensagem
	 */
	public AgendaException(String message) {
		super(message);
	}
	
}
