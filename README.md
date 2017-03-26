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

TODO : Please list key features of your project.

* Users can add KM catalog entries to the repository
* Users can use the KM catalog entries RESTful service to get the entries in JSON format
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

![Landing Page](https://github.com/krodgers351/repo_for_images/raw/master/LandingPage.JPG)
Work in Progress : After the user logs in, they are taken to the landing page. From this page, they can view the KM Catalog entries. They also have the ability to add entries.

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymeleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.