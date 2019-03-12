package app.com.mobileassignment.views

import org.junit.runner.RunWith
import org.junit.runners.Suite

import app.com.mobileassignment.views.features.MapFeature
import app.com.mobileassignment.views.features.SearchFeature

@RunWith(Suite::class)
@Suite.SuiteClasses(
        SearchFeature::class,
        MapFeature::class)

class TestSuite
