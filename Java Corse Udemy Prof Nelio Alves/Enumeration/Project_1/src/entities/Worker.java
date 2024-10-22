package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

//	Basic atributes
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

//	Associations
	private Departament departament;

//	List type no add in constructors
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		super();
		this.name        = name;
		this.level       = level;
		this.baseSalary  = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
	
		for (HourContract c : contracts) {
						
			if (year == c.getDate().getYear() && month == c.getDate().getMonthValue()) {
				sum += c.totalValue();
			}

		}
		return sum;
	}

	@Override
	public String toString() {
		return "Nome: " + name + "\n" + "Departament: " + departament.getName();
	}

}
