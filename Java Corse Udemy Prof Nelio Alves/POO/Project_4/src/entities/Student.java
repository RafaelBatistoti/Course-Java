package entities;

public class Student {

	public String name;
	public double note1;
	public double note2;
	public double note3;

	public double sunNote() {
		return note1 + note2 + note3;
	}

	public double missingPoits() {
		double missing;
		if (sunNote() < 60.0) {
			missing = 60.0 - sunNote();
		} else {
			missing = 0.0;
		}

		return missing;
	}

	public String toString() {
		return String.format("%.2f", sunNote());
	}

}
