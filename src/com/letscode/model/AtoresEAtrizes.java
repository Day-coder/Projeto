package com.letscode.model;


public class AtoresEAtrizes {

	private int index;
	private int year;
	private int age;
	private String name;
	private String movie;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + index;
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtoresEAtrizes other = (AtoresEAtrizes) obj;
		if (age != other.age)
			return false;
		if (index != other.index)
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AtoresEAtrizes [index=" + index + ", year=" + year + ", age=" + age + ", name=" + name + ", movie="
				+ movie + "]";
	}
	public AtoresEAtrizes(int index, int year, int age, String name, String movie) {

		this.index = index;
		this.year = year;
		this.age = age;
		this.name = name;
		this.movie = movie;
	}
	public AtoresEAtrizes() {
	}
	
}
