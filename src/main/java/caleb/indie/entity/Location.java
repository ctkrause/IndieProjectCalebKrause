package caleb.indie.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("area")
	private List<String> area;

	@JsonProperty("__CLASS__")
	private String cLASS;

	@JsonProperty("display_name")
	private String displayName;

	public void setArea(List<String> area){
		this.area = area;
	}

	public List<String> getArea(){
		return area;
	}

	public void setCLASS(String cLASS){
		this.cLASS = cLASS;
	}

	public String getCLASS(){
		return cLASS;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}
}