package caleb.indie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company{

	@JsonProperty("__CLASS__")
	private String cLASS;

	@JsonProperty("display_name")
	private String displayName;

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