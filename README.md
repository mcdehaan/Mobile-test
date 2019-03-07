# Changes
Added test files, dependencies, adjusted gradle, integrated Kotlin

- Added .feature files, step definitions and runner to androidTest folder.
- Added dependencies to build.gradle files.
- Updated Gradle version, sdk target and dependency names
- Integrated Kotlin for Cucumber

Just run the test by right-clicking the .feature file in app/src/androidTest/assets/features. 

# Description
A simple native Android application that shows a city on a map. It provides a list of cities which you can search.

# Acceptence Criteria
* The cities are listed in ascending alphabetical order
* The cities list is scrollable
* The user of the application can search for specific city(ies) 
* The user of the application can select a city to be displayed on the map
* The user of the application can interact with the map (i.e zoom in/out, move to the left/right)
