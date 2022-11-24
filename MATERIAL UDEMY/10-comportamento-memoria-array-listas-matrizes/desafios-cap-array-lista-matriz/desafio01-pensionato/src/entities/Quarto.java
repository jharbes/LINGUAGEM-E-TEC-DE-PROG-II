package entities;

public class Quarto {
	private String nomeHospede;
	private String email;
	
	public Quarto(String nomeHospede, String email) {
		super();
		this.nomeHospede = nomeHospede;
		this.email = email;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
