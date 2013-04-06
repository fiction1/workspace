package novi;

public class Vrijeme {
	private int h;
	private int min;
	private int sec;

	public void setTime(int h, int min, int sec) {
		this.h = ((h >= 0 && h < 24) ? h : 0);
		this.min = ((min >= 0 && min < 60) ? min : 0);
		this.sec = ((sec >= 0 && sec < 60) ? sec : 0);
	}

	public String toMilitary() {
		return String.format("%02d:%02d:%02d", h, min, sec);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((h == 0 || h == 12) ? 12
				: h % 12), min, sec, (h<12 ? "AM" : "PM"));
	}
}
