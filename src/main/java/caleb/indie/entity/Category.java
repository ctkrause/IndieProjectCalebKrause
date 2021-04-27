package caleb.indie.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category{

	@JsonProperty("__CLASS__")
	private String cLASS;

	@JsonProperty("tag")
	private String tag;

	@JsonProperty("label")
	private String label;

	public void setCLASS(String cLASS){
		this.cLASS = cLASS;
	}

	public String getCLASS(){
		return cLASS;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return tag;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}