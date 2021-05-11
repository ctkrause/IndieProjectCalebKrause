### Week 2 
- Chose a project goal based on my disdain for existing job searches
- Created my individual project repository for all project version control
- Wrote my problem statement
- Began listing some technologies that I know and I'm sure more will be added later

I know that I want to accomplish with this project, but I'm not 100% sure yet how I'm going to do so. There has been talks
of screen scraping web services that could help me grab job data from existing job boards. The key for me is organing those 
jobs in a manner which meets or exceeds my own expectations.

### Week 3 
The exercise for week 3 left me feeling frustrated and a bit peeved. I fought with it for around 11 hours, which didn't
leave me time to do the legwork I wanted on my project. The only thing that I did do was I added the hibernate and log4j
config files as I was impelementing them in the weekly work. Hopefully that saves me some time down the road.

### Week 4 -
- Double checked all checkpoint one deliverables and completed review.

### Week 5 -
- Added another table to the database, this one for roles, and annotated for a many to one relationship. Unit tested full CRUD
for the user and the roles table. All tests are passing at this time and code coverage is 100%.

### Week 6 -
- Attempted to deploy to AWS, but could not get result set from database to show up in the web browser using Tomcat. Attempted
several different techniques to resolve the issue, including reworking the servlet and the jsp. JSP is set to index, but no
  results are appearing in the browser. Deployed week 2 user display exercise to AWS just to get something out there that would
  verify I had successfully setup my EC2 instance.

### Week 7 -
- Reworked my database tables and columns and added a third table for jobs that users might want to store. May still need 
to tweak database at some point, but after redoing all the testing using these new table names and columns they are all 
  passing again. Still need to check code coverage, unit test the jobs table, and add authentication. 

### Week 8 -

- Played around with lots of different APIs, but I wasn't able to implement any of the ones I was trying to use.
- Figured out how to use a key and get information back, but had some difficulty progressing from there. 
- Reverted to the pet API in order to complete the week eight exercise and test. 
- Wrote an applicable unit test and verified receipt of the correct information. 

### Week 9 -

- Checking for different APIs still...running into many issues where APIs are deprecated, require an issued authorization or otherwise.
- Having some trouble testing API endpoints for APIs that I can use.
- Learning how to handle the JSON data and generate appropriate pojos so that I can use the data in the application.

### Week 10 -

- Mostly worked on team project, but learned a lot about restful services and the overall structure of an API.
- Worked on setting up the repo and inviting the other team members so we can all write to the repo.

### Week 11 -

- Team project.
- Began testing endpoints and working on documentation for the project.

### Week 12 -

- Team project.
- Completed documentation, deployed project to AWS and tested to make sure all endpoints working correctly.

### Week 13 -

- Looking into Google talent API that allows users to create job board and use machine learning to suggest jobs based on user activity.
- Lots of documentation, almost too much, can be difficult to locate exactly what's necessary.
- Tons of dependencies and different plugins needed to work with this API.

### Week 14 -

- Scrapped Google talent API due to complexity. 
- Seems more tailored for a team of devs that can implement into a much larger operation.
- Looking for API that will return job data without authorization that cannot be obtained.
- Some job APIs require that you post jobs to their site before you can get read access (Indeed).
- Started working with Remotive API....seems like it is read only.

### Week 15 -

- Was able to get data from the Remotive API and output to browser despite POJO issues and some wrapper JSON.
- All endpoints are working and coded in a search bar so users can lookup jobs using the different endpoints.

### Week 16 -
- Annoyed at myself for not getting farther with this and adding more capability, but determined to keep working on it over the summer.
- Achieved what I could with the time I left myself, but need to do more testing and add in the ability to let users store jobs in the database for retrieval.
- Application is at least returning job data and was able to implement data table. 
- Admin capabilites test well and able to delete users is functional still. 
- Learned a lot about falling short of project plan and constantly reminded things more time consuming than anticipated.