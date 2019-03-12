# Changes
Added test files, dependencies, adjusted gradle, integrated Kotlin

- Removed .feature files, step definitions and runner from androidTest folder.
- Updated Gradle version to 5.1
- Added TestSuite configuration

Just start the test by running the TestSuite configuration. I noticed the app might get a bit confused on emulators so I would recommend running it on a physical device. 

# Description
A simple native Android application that shows a city on a map. It provides a list of cities which you can search.

# Acceptence Criteria
* The cities are listed in ascending alphabetical order
* The cities list is scrollable
* The user of the application can search for specific city(ies) 
* The user of the application can select a city to be displayed on the map
* The user of the application can interact with the map (i.e zoom in/out, move to the left/right)
