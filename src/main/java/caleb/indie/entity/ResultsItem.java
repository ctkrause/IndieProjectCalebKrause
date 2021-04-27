package caleb.indie.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("created")
	private String created;

	@JsonProperty("latitude")
	private double latitude;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("contract_time")
	private String contractTime;

	@JsonProperty("salary_is_predicted")
	private String salaryIsPredicted;

	@JsonProperty("adref")
	private String adref;

	@JsonProperty("__CLASS__")
	private String cLASS;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("company")
	private Company company;

	@JsonProperty("id")
	private String id;

	@JsonProperty("category")
	private Category category;

	@JsonProperty("redirect_url")
	private String redirectUrl;

	@JsonProperty("longitude")
	private double longitude;

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setContractTime(String contractTime){
		this.contractTime = contractTime;
	}

	public String getContractTime(){
		return contractTime;
	}

	public void setSalaryIsPredicted(String salaryIsPredicted){
		this.salaryIsPredicted = salaryIsPredicted;
	}

	public String getSalaryIsPredicted(){
		return salaryIsPredicted;
	}

	public void setAdref(String adref){
		this.adref = adref;
	}

	public String getAdref(){
		return adref;
	}

	public void setCLASS(String cLASS){
		this.cLASS = cLASS;
	}

	public String getCLASS(){
		return cLASS;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return company;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setRedirectUrl(String redirectUrl){
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectUrl(){
		return redirectUrl;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}
}