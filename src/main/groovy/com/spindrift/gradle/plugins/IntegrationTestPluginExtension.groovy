package com.spindrift.gradle.plugins
/**
 * Provides configuration for the integration test plugin
 * All properties can be set directly or using its DSL equivalent
 * e.g.
 * <code>
 * integration-test {
 *   javaSourceDir='path/to/java' //Direct setting
 *   javaSourceDir 'path/to/java' //Optional DSL style setting
 * }
 * </code>
 *
 * @author hallatech
 *
 */

class IntegrationTestPluginExtension {

  String javaSourceDir = 'src/integration-test/java'
  void javaSourceDir(String javaSourceDir) {
    this.javaSourceDir = javaSourceDir
  }

  String resourcesSourceDir = 'src/integration-test/resources'
  void resourcesSourceDir(String resourcesSourceDir) {
    this.resourcesSourceDir = resourcesSourceDir
  }

  String htmlReportsDestination = 'reports/integration-tests'
  void htmlReportsDestination(String htmlReportsDestination) {
    this.htmlReportsDestination = htmlReportsDestination
  }

  String junitXmlReportsDestination = 'integration-test'
  void junitXmlReportsDestination(String junitXmlReportsDestination) {
    this.junitXmlReportsDestination = junitXmlReportsDestination
  }

  boolean checkDependsOnIntegrationTest = true
  void checkDependsOnIntegrationTest(boolean checkDependsOnIntegrationTest) {
    this.checkDependsOnIntegrationTest = checkDependsOnIntegrationTest
  }

  boolean mustRunAfterTest = true
  void mustRunAfterTest(boolean mustRunAfterTest) {
    this.mustRunAfterTest = mustRunAfterTest
  }
}
