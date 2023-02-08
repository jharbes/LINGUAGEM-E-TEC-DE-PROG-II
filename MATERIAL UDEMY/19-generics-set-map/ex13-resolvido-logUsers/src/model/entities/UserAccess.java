package model.entities;

import java.time.Instant;
import java.util.Objects;

public class UserAccess implements Comparable<UserAccess> {
	
	private String name;
	private Instant instant;
	
	public UserAccess() {
	}

	public UserAccess(String name, Instant instant) {
		super();
		this.name = name;
		this.instant = instant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccess other = (UserAccess) obj;
		return Objects.equals(name, other.name);
	}
	
	

	@Override
	public String toString() {
		return "UserAccess [name=" + name + ", instant=" + instant + "]";
	}

	@Override
	public int compareTo(UserAccess other) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
