# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/).

## [Unreleased]
### Added
- TBD.

## [v1.4] - 2017-03-25
### Added
- Document Category Entry entity
- Document Category Entries repository
- RESTful web service for Document Category Entries that returns JSON
- MVC Controller that implement get and post methods for Document Categories
- MVC HTML Page that's wired to the Document Category Entries repository
- Community Entry entity
- Community Entries repository
- RESTful web service for Community Entries that returns JSON
- MVC Controller that implement get and post methods for Community
- MVC HTML Page that's wired to the Community Entries repository
- Product Entry entity
- Product Entries repository
- RESTful web service for Product Entries that returns JSON
- MVC Controller that implement get and post methods for Product
- MVC HTML Page that's wired to the Product Entries repository
- Department Entry entity
- Department Entries repository
- RESTful web service for Department Entries that returns JSON
- MVC Controller that implement get and post methods for Department
- MVC HTML Page that's wired to the Department Entries repository
- jQuery-3.2.0.min.js library
- d3.min.js library
- AJAX call to the Document Category, Product, and Community web services to dynamically populate form dropdown in kmcatalogentries
- A d3 page that calls the KM Catalog web service to get JSON to show what documents exist and dynamically build a d3 tree to visualize the KM catalog - Currently not working - tree doesn't display

### Changed
- styles.css file to add/modify styling
- MvcConfig file for document categories, departments, communities, and products
- FullStackWebApplication file to reflect the document categories, products, and communities
- README.md to show changes

## [v1.3] - 2017-02-17
### Added
- KM Catalog Entry entity
- KM Catalog Entries repository
- RESTful web service for KM Catalog Entries that returns JSON
- MVC Controller that implement get and post methods for KM Catalog Entries
- MVC Page that's wired to the KM Catalog Entries repository
- Images
- Cascading Style Sheets for the Welcome, Login, and KM Catalog pages

### Changed
- HTML for Login and Welcome page
- MvcConfig file for kmcatalogentries
- FullStackWebApplication file to reflect the KM Catalog
- README.md to show changes

## [v1.2] - 2017-01-27
### Added
- Answered in README.md
    - What is the proposed name for your Web application?
    - Who is the target audience for your Web application?
    - What problem is it intended to solve for the target audience?
    - How will it meet the minimum project requirements?
    - Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements? 

## [v1.1] - 2017-01-19
### Added
- Cloned, configured, and compiled the starter project
- Configured developer workspace
- Deployed to Heroku

[Unreleased]: https://github.com/infsci2560sp17/full-stack-web-krodgers351/compare/v1.4...HEAD
[v1.4]: https://github.com/infsci2560sp17/full-stack-web-krodgers351/compare/v1.3...v1.4
[v1.3]: https://github.com/infsci2560sp17/full-stack-web-krodgers351/compare/v1.2...v1.3
[v1.2]: https://github.com/infsci2560sp17/full-stack-web-krodgers351/compare/v1.1...v1.2
[v1.1]: https://github.com/infsci2560sp17/full-stack-web-krodgers351/compare/...v1.1