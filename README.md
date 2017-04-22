# iKnowledge

1. What is the proposed name for your Web application?
	- iKnowledge 
2. Who is the target audience for your Web application?
	- Employees within my organization that need to find information. Organizations can be broken down structurally into different entities based on functional responsibilities. Employees not only need to be able to efficiently and accurately find the information they need within their own entity, but also potentially across entities. 
3. What problem is it intended to solve for the target audience?
	- As with any knowledge management system, the problem it attempts to solve is how to share knowledge within and potentially across organizations through a system that creates, stores, and propagates information.  I’m basing the specific problem this project will solve based on the current practice within the organization I work at. Currently knowledge and information is spread all over the place. Knowledge can be found within an individual’s folder on a shared network, in random lists on Sharepoint, and stored on an individual’s computer. There is no central repository that an employee can go look to find the information they need. They waste time combing the shared network and Sharepoint to find what they need with no guarantee that what they find is valid or the most up-to-date information. Another problem is that there are a large percentage of employees that have been with the organization for a long time and a push to bring in new employees. This inherently means there is a large gap in knowledge. The KMS allows for a medium to narrow that gap by providing a mechanism for the older subject matter experts to impart what they know in a manner that will store that knowledge. Additionally, employees must not just be able to find information. They must be able to find what they need quickly and accurately. This can be a problem if there is a massive amount of information stored in many documents within an organization. The KMS proposed for this project will also take that into consideration.
4. How will it meet the minimum project requirements?
	- Although users within my organization will not need to log into the app, for the purpose of this project I will have users create accounts, with the ability to update their information and also delete their accounts. I can use this login to simulate the fact that not all employees are privileged to all information. For information that is public to all they will not need to log-in. For information that only certain individuals should be able to access since it may be specific to certain units, I will require the user to log-in with the correct certification/role, which will be stored in a database with their account information, to be able to access that information. The roles that will be assigned to users will be based on the unit they belong to within the sub-division. Sub-division level managers and unit managers will be granted additional roles that will allow them access to more information.  All data for the KMS will be created, updated, retrieved, and deleted through RESTful services and will be handled using both JSON and XML formats. The form used to create information will also include fields for metadata to allow for efficient retrieval and filtering of knowledge.  This project will utilize Object Oriented Programming and attempt to follow the SOLID coding methodology and any other good programming styles taught in class. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
	- My application is unique because I’m designing it specifically for the needs of my organization. Improving knowledge management is an official objective of my sub-division for 2017. Being on the knowledge management team within my unit, I’ll be involved in defining and implementing the specific requirements for the system and how to incorporate it with the many other units within the sub-division as a whole.    


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-krodgers351.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-krodgers351)

## Changelog

[Changelog] (CHANGELOG.md)

## Web Site

[iKnowledge](https://hidden-basin-47412.herokuapp.com/) ![](https....)

## Key Features

List of key features of your project.

* Users can add KM catalog entries to the repository
* Users can edit KM catalog entries in the repository
* Users can delete KM catalog entries from the repository 
* Users can search the KM catalog entries and get results in a table
* Users can search for KM catalog entries in a dynamically built d3 tree
* Users can use the KM catalog entries RESTful service to get the entries in JSON format
* Users can upload files to match a KM catalog entry filename to allow the d3 tree to get that file when the title is clicked
* Users can add document category entries to the repository
* Users can use the document category entries RESTful service to get the entries in JSON format
* Users can add community entries to the repository
* Users can use the community entries RESTful service to get the entries in JSON format
* Users can add department entries to the repository
* Users can use department entries RESTful service to get the entries in JSON format
* Users can add product entries to the repository
* Users can use the product entries RESTful service to get the entries in JSON format

## Project Details

### Landing Page

![Landing Page](https://github.com/krodgers351/repo_for_images/raw/master/landingpage2.JPG)
Work in Progress : After the user logs in, they are taken to the landing page. From this page, they can view the KM Catalog entries. They also have the ability to add entries.

### User Input Form

![KM Catalog Entry Form](https://github.com/krodgers351/repo_for_images/raw/master/kmcatalogform.JPG)
This application allows users to add km catalog entries to the repository. The form allows the users to enter information about the entry. All
fields are required. The upload file button is not actually part of the form per se, but positioned there to remind the user to upload a file
that matches the filename of the entry so the d3 tree will go to it when that entry is clicked on. 

## API

One interface this application has allows for filtered results of the km catalog based off of the text the users enters into a seaarch field.
For each letter typed or deleted, there is an AJAX call to the service with the typed text passed. The service will filter the km repository entries based on the text.
The service will return in JSON format the entries that pertain to the search text.

### API Method 1

    GET /public/api/kmcatalogentries/search

#### Parameters

- **search** _(required)_ — The text to filter the km catalog on. If search is null, then it just calls the km catalog entries service and returns
all entries.

#### Response

JSON containing the list of km entries that contain the search text in any of its properties.

#### Errors

No, errors. If there aren't any entries that match the search, the API just returns an empty response entity.

#### Example

##### Request

    Get /public/api/kmcatalogentries/sta

##### Body

    searchText=sta


##### JSON Response

![Response from WS](https://github.com/krodgers351/repo_for_images/raw/master/search_json_sta.JPG)
![Response displayed in App](https://github.com/krodgers351/repo_for_images/raw/master/search_result.JPG)

## Technologies Used

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymeleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
- [jQuery](https://jquery.com/) - jQuery is a fast, small, and feature-rich JavaScript library.
- [d3](https://d3js.org/) - D3.js is a JavaScript library for manipulating documents based on data. D3 helps you bring data to life using HTML, SVG, and CSS.