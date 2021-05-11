package caleb.indie.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Jobs item.
 */
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

	/**
	 * Get job type string.
	 *
	 * @return the string
	 */
	public String getJobType(){
		return jobType;
	}

	/**
	 * Get company logo url string.
	 *
	 * @return the string
	 */
	public String getCompanyLogoUrl(){
		return companyLogoUrl;
	}

	/**
	 * Get candidate required location string.
	 *
	 * @return the string
	 */
	public String getCandidateRequiredLocation(){
		return candidateRequiredLocation;
	}

	/**
	 * Get company name string.
	 *
	 * @return the string
	 */
	public String getCompanyName(){
		return companyName;
	}

	/**
	 * Get publication date string.
	 *
	 * @return the string
	 */
	public String getPublicationDate(){
		return publicationDate;
	}

	/**
	 * Get description string.
	 *
	 * @return the string
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
	public int getId(){
		return id;
	}

	/**
	 * Get title string.
	 *
	 * @return the string
	 */
	public String getTitle(){
		return title;
	}

	/**
	 * Get category string.
	 *
	 * @return the string
	 */
	public String getCategory(){
		return category;
	}

	/**
	 * Get salary string.
	 *
	 * @return the string
	 */
	public String getSalary(){
		return salary;
	}

	/**
	 * Get url string.
	 *
	 * @return the string
	 */
	public String getUrl(){
		return url;
	}

	/**
	 * Get tags list.
	 *
	 * @return the list
	 */
	public List<Object> getTags(){
		return tags;
	}

	/**
	 * Get job count int.
	 *
	 * @return the int
	 */
	public int getJobCount(){
		return jobCount;
	}

	/**
	 * Get jobs list.
	 *
	 * @return the list
	 */
	public List<JobsItem> getJobs(){
		return jobs;
	}

	/**
	 * Get json member 0 legal notice string.
	 *
	 * @return the string
	 */
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