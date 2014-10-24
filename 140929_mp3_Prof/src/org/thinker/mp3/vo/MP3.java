package org.thinker.mp3.vo;

public class MP3 {

	private final String filename;
	private final String desc;
	// final : 변수의 값이 하나 setting되면 바꿀 수 없음 
	// filename이 한번 설정되면 외부에서 함부러 바꿀 수 없게 하기 위해서 final을 선언해줌
	public MP3(String filename, String desc) {
		super();
		this.filename = filename;
		this.desc = desc;
	}
	
	public String getfilename() {
		return filename;
	}
	
	public String getDesc() {
		return desc;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((filename == null) ? 0 : filename.hashCode());
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
		MP3 other = (MP3) obj;
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MP3 [filename=" + filename + ", desc=" + desc + "]";
	}
	
	
}
