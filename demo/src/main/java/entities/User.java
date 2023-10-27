package entities;
import java.util.Objects;


public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String nome;
	String email;
	String telefone;
	String password;

	/*CONSTRUTOR 1 */

	public User() {



	}
	/*CONSTRUTOR 2 */

	public User(int id, String nome, String email, String telefone, String passaword) {


	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, password, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(telefone, other.telefone);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public class serialVersionUID implements Serializable{


	}
	}
