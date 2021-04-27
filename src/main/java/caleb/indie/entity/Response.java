package caleb.indie.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("mean")
	private double mean;

	@JsonProperty("count")
	private int count;

	@JsonProperty("__CLASS__")
	private String cLASS;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setMean(double mean){
		this.mean = mean;
	}

	public double getMean(){
		return mean;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setCLASS(String cLASS){
		this.cLASS = cLASS;
	}

	public String getCLASS(){
		return cLASS;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}