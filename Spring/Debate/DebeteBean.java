package com.xworkz.debet.debetebean;


public class DebeteBean {
	private String topic;
	private int duration;
	private String language;
	
	public DebeteBean() {
		System.out.println("Object get created");
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	/*public DebeteBean(String topic, int duration) {
		this();
		this.topic=topic;
		this.duration=duration;
	}
	
	public DebeteBean(String topic, int duration, String language) {
		super();
		this.topic=topic;
		this.duration=duration;
		this.language=language;
		
	}*/
	public void speech() {
		System.out.println("The speech is on "+this.topic+ " for "+this.duration+ " min in "+this.language+ " language");
	}
	
	
	
}
