/* 
  This is a standard build defined in the central shared library 
  See http://bitbucket-lab.labsii.loc:7990/projects/SIIFORGE/repos/pipeline-libraries for more info
*/

pipeline {
  agent any

  stages {

    stage('Build init') {
      steps {
        // Use with this syntax to be able to call folder props
        // Such as the teams webhook url
        withFolderProperties {
          buildInit()
        }
      }
    }


    stage ('Compile sources') {
      steps {
            mavenBuild ()
        }
    }


    stage ('Publish tests reports') {
      steps {
            publishTestReports ()
        }
    }


    stage ('Deploy package to Nexus') {
      steps {
            deployToMavenRepo ( extractInfos: 'pom' )
        }
    }

  } // End Stages

} // End pipeline