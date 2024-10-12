### ModelAndView 
* Example : CustomerController
***
* The ModelAndView class has an important task in generating responses. 
* ModelAndView instances make it easy to create associations between data models and views. 
* In which data model is the object containing data to display on the view.

`new ModelAndView(logical_name_of_view,logical_name_of_model_data, actual_value_of_model_data);`

* *logical_name_of_view: name of the view we want to display data.*
* *logical_name_of_model_data: name of the object containing the data.*
* *actual_value_of_model_data: object containing data.*
***
*pom.xml*
```xml
<dependencies>
    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
        <version>2.0.0</version>
    </dependency>
    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
        <version>3.0.1</version>
    </dependency>
</dependencies>
```

Resolve error:
``
https://stackoverflow.com/questions/75123103/java-lang-noclassdeffounderror-jakarta-servlet-jsp-jstl-core-config-in-tomcat
``
***
### Please search and study
* ModelMap
* Interface ViewResolverPage
* Model 2 and MVC design pattern
***
