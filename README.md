# TestNG02

Example program showing how to use TestNG and Selenium WebDriver, following a Page Objects model.

This example shows running Selenium tests against pages on Google and Toptal.  It includes navigating from
page to page, checking page content, looking up WebElements on the pages, and organzing the WebElements
into Page models.

TestNG is used to provide the test framework, and request and monitor test execution.

Within Selenium, this example is using locaters based on id, class, link_text, and Xpath.

The project is broken up into four distinct subprojects, each of which have a specific function.

The build tool used is Maven 3.6.x.

## Organization

### Framework

This subproject defines the base classes for Test and for Pages.  These classes would be common to all test 
applications, and could be moved into a library.

### Domain

This subproject defines all content domain classes.  For instance, on TopTal, a candidate can register with a name,
email, etc. along with a type, such as Designer or Developer.

There is an enum for the type, and class for the candidate.

### Page-Objects

All Page Objects are defined here.  They are broken out into those for Google, and those for Toptal, starting with
a home page for each.

### Regression-Tests

The actual tests are located here.  Since the tests are mostly creating and using the Page Objects, the tests themselves
are quite short.  Putting the complexity into the Page Objects helps assure that re-use is being generated across 
multiple tests (in this example there are not many tests, but in production tests we have found that the
page objects are used from several times to dozens of times).

## For more information

Contact j.s.risberg@gmail.com

This repo is located at https://github.com/JeffRisberg/TestNG02




