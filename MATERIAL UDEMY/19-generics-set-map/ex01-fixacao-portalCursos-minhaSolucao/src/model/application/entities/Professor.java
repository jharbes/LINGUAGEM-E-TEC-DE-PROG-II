package model.application.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Professor {

	private Integer id;
	private String name;

	private Set<Curso> cursos = new HashSet<>();

	public Professor() {
	}

	public Professor(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", cursos=" + cursos + "]";
	}

}
