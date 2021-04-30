package caleb.indie.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JobsItem{

	@JsonProperty("job_type")
	private String jobType;

	@JsonProperty("company_logo_url")
	private String companyLogoUrl;

	@JsonProperty("candidate_required_location")
	private String candidateRequiredLocation;

	@JsonProperty("company_name")
	private String companyName;

	@JsonProperty("publication_date")
	private String publicationDate;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("category")
	private String category;

	@JsonProperty("salary")
	private String salary;

	@JsonProperty("url")
	private String url;

	@JsonProperty("tags")
	private List<Object> tags;

	@JsonProperty("job-count")
	private int jobCount;

	@JsonProperty("jobs")
	private List<JobsItem> jobs;

	@JsonProperty("0-legal-notice")
	private String jsonMember0LegalNotice;

	public String getJobType(){
		return jobType;
	}

	public String getCompanyLogoUrl(){
		return companyLogoUrl;
	}

	public String getCandidateRequiredLocation(){
		return candidateRequiredLocation;
	}

	public String getCompanyName(){
		return companyName;
	}

	public String getPublicationDate(){
		return publicationDate;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getCategory(){
		return category;
	}

	public String getSalary(){
		return salary;
	}

	public String getUrl(){
		return url;
	}

	public List<Object> getTags(){
		return tags;
	}

	public int getJobCount(){
		return jobCount;
	}

	public List<JobsItem> getJobs(){
		return jobs;
	}

	public String getJsonMember0LegalNotice(){
		return jsonMember0LegalNotice;
	}

	@Override
 	public String toString(){
		return 
			"JobsItem{" + 
			"job_type = '" + jobType + '\'' + 
			",company_logo_url = '" + companyLogoUrl + '\'' + 
			",candidate_required_location = '" + candidateRequiredLocation + '\'' + 
			",company_name = '" + companyName + '\'' + 
			",publication_date = '" + publicationDate + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",category = '" + category + '\'' + 
			",salary = '" + salary + '\'' + 
			",url = '" + url + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}